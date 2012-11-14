package kkps.exceedvotedao.dao;

import kkps.exceedvotedao.dao.jpa.JpaDaoFactory;

/**
 * DaoFactory.java
 * 
 * @author Kanokphol Techarattanaprasert
 */
public abstract class DaoFactory {
	
	private static DaoFactory instance = null;
	
	public static DaoFactory getInstance() {
		if (instance == null) {
			instance = new JpaDaoFactory();
		}
		return instance;
	}
	
	public abstract BallotDao getBallotDao();
	
	public abstract UserDao getUserDao();

}
