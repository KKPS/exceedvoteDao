package kkps.exceedvotedao.dao.jpa;

import javax.persistence.*;
import kkps.exceedvotedao.dao.*;

public class JpaDaoFactory extends DaoFactory {
	
	private static final String PERSISTENCE_UNIT = "exceedvotedao";
	
	private BallotDao ballotDao;
	
	private UserDao userDao;
	
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

}
