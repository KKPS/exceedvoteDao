package kkps.exceedvotedao.dao;

import java.util.List;
import kkps.exceedvotedao.models.Ballot;
import kkps.exceedvotedao.models.User;

public interface BallotDao {
	
	public Ballot findById(int id);
	
	public List<Ballot> findAll();
	
	public List<Ballot> findByUser(User user);
	
	public void save(Ballot ballot);
	
	public void delete(Ballot ballot);

}
