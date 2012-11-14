package kkps.exceedvotedao.models;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Project
 * 
 * @author Kanokphol Techarattaprasert
 */
@Entity

public class Project implements Serializable {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private static final long serialVersionUID = 1L;

	public Project() {
		super();
	}   
	
	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
