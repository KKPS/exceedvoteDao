package kkps.exceedvotedao.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import kkps.exceedvotedao.dao.UserDao;
import kkps.exceedvotedao.models.User;

public class JpaUserDao implements UserDao {
	
	private EntityManager em;
	
	public JpaUserDao(EntityManager em) {
		this.em = em;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

}
