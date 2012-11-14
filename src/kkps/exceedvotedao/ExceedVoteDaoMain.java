package kkps.exceedvotedao;

import java.util.List;
import kkps.exceedvotedao.*;
import kkps.exceedvotedao.dao.*;
import kkps.exceedvotedao.dao.jpa.*;
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
		testUserDao();
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
		// TODO
	}

}
