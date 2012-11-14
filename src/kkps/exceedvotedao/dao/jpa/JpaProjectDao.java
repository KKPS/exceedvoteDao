package kkps.exceedvotedao.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import kkps.exceedvotedao.dao.ProjectDao;
import kkps.exceedvotedao.models.Project;

public class JpaProjectDao implements ProjectDao {
	
	private EntityManager em;
	
	public JpaProjectDao(EntityManager em) {
		this.em = em;
	}

	@Override
	public void save(Project project) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(project);
		tx.commit();
	}	

}
