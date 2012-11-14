package kkps.exceedvotedao.dao.jpa;

import javax.persistence.*;
import kkps.exceedvotedao.dao.*;

public class JpaDaoFactory extends DaoFactory {
	
	private static final String PERSISTENCE_UNIT = "exceedvotedao";
	
	private BallotDao ballotDao;
	
	private UserDao userDao;
	
	private ProjectDao projectDao;
	
	private QuestionDao questionDao;
	
	private EntityManagerFactory emf;
	
	private EntityManager em;
	
	public JpaDaoFactory() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
		em = emf.createEntityManager();
	}
	
	public BallotDao getBallotDao() {
		if (ballotDao == null) {
			ballotDao = new JpaBallotDao(em);
		}
		return ballotDao;
	}
	
	public UserDao getUserDao() {
		if (userDao == null) {
			userDao = new JpaUserDao(em);
		}
		return userDao;
	}
	
	public ProjectDao getProjectDao() {
		if (projectDao == null) {
			projectDao = new JpaProjectDao(em);
		}
		return projectDao;
	}
	
	public QuestionDao getQuestionDao() {
		if (questionDao == null) {
			questionDao = new JpaQuestionDao(em);
		}
		return questionDao;
	}

}
