package kkps.exceedvotedao.dao.jpa;

import java.util.List;
import javax.persistence.*;
import kkps.exceedvotedao.dao.BallotDao;
import kkps.exceedvotedao.models.Ballot;
import kkps.exceedvotedao.models.User;

public class JpaBallotDao implements BallotDao {
	
	private EntityManager em;
	
	public JpaBallotDao(EntityManager em) {
		this.em = em;
	}

	@Override
	public Ballot findById(int id) {
		return em.find(Ballot.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ballot> findAll() {
		String query = "SELECT b FROM Ballot b";
		return em.createQuery(query).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ballot> findByUser(User user) {
		Query query = em.createQuery("SELECT b FROM Ballot b WHERE b.user= :user");
		query.setParameter("user", user);
		return query.getResultList();
	}

	@Override
	public void save(Ballot ballot) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(ballot);
		tx.commit();
	}

	@Override
	public void delete(Ballot ballot) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(ballot);
		tx.commit();
	}

}
