package kkps.exceedvotedao.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import kkps.exceedvotedao.dao.QuestionDao;
import kkps.exceedvotedao.models.Question;

public class JpaQuestionDao implements QuestionDao {

private EntityManager em;
	
	public JpaQuestionDao(EntityManager em) {
		this.em = em;
	}

	@Override
	public void save(Question question) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(question);
		tx.commit();
	}

}
