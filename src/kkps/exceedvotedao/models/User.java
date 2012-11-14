package kkps.exceedvotedao.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 * @author Kanokphol Techarattanaprasert
 */
@Entity

public class User implements Serializable {

	@Id
	private Long id;
	private String username;
	private String password;
	private String fullName;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}
	
	public User(String username, String password, String fullName) {
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
   
}
