package kkps.exceedvotedao.dao;

import java.util.List;
import kkps.exceedvotedao.models.Ballot;

public interface BallotDao {
	
	public Ballot findById(int id);
	
	public List<Ballot> findAll();
	
	public List<Ballot> findByUser(String query);
	
	public void save(Ballot ballot);
	
	public void delete(Ballot ballot);

}
