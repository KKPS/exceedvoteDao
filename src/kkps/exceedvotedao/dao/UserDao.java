package kkps.exceedvotedao.dao;

import java.util.List;
import kkps.exceedvotedao.models.User;

public interface UserDao {
	
	public User findById(int id);
	
	public User findByUser(String username);
	
	public List<User> findAll(); 
	
	public void save(User user);
	
	public void delete(User user);

}
