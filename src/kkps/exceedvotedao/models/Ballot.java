package kkps.exceedvotedao.models;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;
import kkps.exceedvotedao.models.Project;
import kkps.exceedvotedao.models.Question;
import kkps.exceedvotedao.models.User;

/**
 * Entity implementation class for Entity: Ballot
 *
 */
@Entity

public class Ballot implements Serializable {

	   
	@Id
	private Long id;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	private Project project;
	private Question question;
	private static final long serialVersionUID = 1L;

	public Ballot() {
		super();
	}   
	
	public Ballot(User user, Project project, Question question) {
		this.user = user;
		this.project = project;
		this.question = question;
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}   
	
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}   
	
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
   
}