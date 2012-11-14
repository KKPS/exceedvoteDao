package kkps.exceedvotedao.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import kkps.exceedvotedao.dao.UserDao;
import kkps.exceedvotedao.models.User;

public class JpaUserDao implements UserDao {
	
	private EntityManager em;
	
	public JpaUserDao(EntityManager em) {
		this.em = em;
	}

	@Override
	public User findById(int id) {
		return em.find(User.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		String query = "SELECT u FROM User u";
		return em.createQuery(query).getResultList();
	}

	@Override
	public void save(User user) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(user);
		tx.commit();
	}

	@Override
	public void delete(User user) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(user);
		tx.commit();
	}

	@Override
	public User findByUser(String username) {
		String query = "SELECT u FROM User u WHERE u.username='" + username + "'";
		return (User) em.createQuery(query).getSingleResult();
	}

}
