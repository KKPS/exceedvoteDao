package kkps.exceedvotedao;

import java.util.List;
import kkps.exceedvotedao.dao.*;
import kkps.exceedvotedao.models.*;

/**
 * ExceedVoteDaoMain.java
 * 
 * @author Kanokphol Techarattanaprasert
 */
public class ExceedVoteDaoMain {

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Begin UserDao test
		// testUserDao();
		// Begin BallotDao test
		testBallotDao();
	}
	
	/**
	 * UserDao console test
	 */
	public static void testUserDao() {
		// Initialize userDao
		UserDao userDao = DaoFactory.getInstance().getUserDao();
		// Create User
		User sonnyhonny = new User("sonnyhonny", "exceedvote", "Kanokphol Techarattanaprasert");
		User batman = new User("batman", "darkknightrises", "Bruce Wayne");
		User rasalghul = new User("rasalghul", "leagueofshadow", "Ra's al Ghul");
		// Save User to the database
		userDao.save(sonnyhonny);
		System.out.println("Saved sonnyhonny with id " + sonnyhonny.getId());
		userDao.save(batman);
		System.out.println("Saved batman with id " + batman.getId());
		userDao.save(rasalghul);
		System.out.println("Saved rasalghul with id " + rasalghul.getId());
		// Retrieve all User from the database and store in users
		List<User> users = userDao.findAll();
		// Print all User in users
		for (User user : users) {
			System.out.println(user.toString());
		}
	}
	
	/**
	 * BallotDao console test
	 * 
	 * Ballot represent a vote from User. Ballot have 3 attributes
	 * 1. User is the user who owned this Ballot
	 * 2. Project is the Project that's User voted
	 * 3. Question is the Question of this Ballot
	 */
	public static void testBallotDao() {
		// Initialize BallotDao
		BallotDao ballotDao = DaoFactory.getInstance().getBallotDao();
		UserDao userDao = DaoFactory.getInstance().getUserDao();
		ProjectDao projectDao = DaoFactory.getInstance().getProjectDao();
		QuestionDao questionDao = DaoFactory.getInstance().getQuestionDao();
		// Initialize and save User, Project, and Question for Ballot
		User batman = new User("batman", "darkknightrises", "Bruce Wayne");
		User rasalghul = new User("rasalghul", "leagueofshadow", "Ra's al Ghul");
		userDao.save(batman);
		userDao.save(rasalghul);
		Project exceedvote = new Project("eXceed Vote", "Software Spec and Design Project");
		Project worldnote = new Project("WorldNote", "BEST project in eXceed Camp #9!!! :D");
		projectDao.save(exceedvote);
		projectDao.save(worldnote);
		Question popular = new Question("Popular Vote");
		Question uinterface = new Question("Best User Interface Design");
		questionDao.save(popular);
		questionDao.save(uinterface);
		// Create Ballot
		Ballot ballotb1 = new Ballot(batman, worldnote, popular);
		Ballot ballotb2 = new Ballot(batman, exceedvote, uinterface);
		Ballot ballotr1 = new Ballot(rasalghul, worldnote, popular);
		// Save Ballot to the database
		ballotDao.save(ballotb1);
		System.out.println("Saved batman's ballot 1 with id " + ballotb1.getId());
		ballotDao.save(ballotb2);
		System.out.println("Saved batman's ballot 2 with id " + ballotb2.getId());
		ballotDao.save(ballotr1);
		System.out.println("Saved rasalghul's ballot 1 with id " + ballotr1.getId());
		// Retrieve all batman's Ballot
		List<Ballot> batballots = ballotDao.findByUser(batman);
		// Print all Ballot in batballots
		for (Ballot ballot : batballots) {
			System.out.println(ballot.toString());
		}
		System.out.println("=============================");
		// Get User from database
		User get = userDao.findByUser("rasalghul");
		System.out.println(get.toString());
		// Get all "get" ballots
		List<Ballot> getb = ballotDao.findByUser(get);
		for (Ballot b : getb) {
			System.out.println(b.toString());
		}
	}

}
