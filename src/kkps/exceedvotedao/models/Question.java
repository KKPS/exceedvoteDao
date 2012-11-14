package kkps.exceedvotedao.models;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Question
 *
 */
@Entity

public class Question implements Serializable {

	@Id
	private Long id;
	private String question;
	private static final long serialVersionUID = 1L;

	public Question() {
		super();
	}   
	
	public Question(String question) {
		this.question = question;
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
   
}
