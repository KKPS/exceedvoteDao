package kkps.exceedvotedao.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import kkps.exceedvotedao.dao.BallotDao;
import kkps.exceedvotedao.models.Ballot;

public class JpaBallotDao implements BallotDao {
	
	private EntityManager em;
	
	public JpaBallotDao(EntityManager em) {
		this.em = em;
	}

	@Override
	public Ballot findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ballot> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ballot> findByUser(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Ballot ballot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Ballot ballot) {
		// TODO Auto-generated method stub
		
	}

}
