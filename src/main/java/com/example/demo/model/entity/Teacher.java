package com.example.demo.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	  @Column(name = "name")
	  private String name;
	 
	  @Column(name = "email")
	  private String emailAddress;
	  @Column(name = "courseId")
	  private int courseId;
	  
	  protected Teacher()
	  {
		  super();
	  }

	  public Teacher(String name, String emailAddress, int courseId) {
			super();
			this.name = name;
			this.emailAddress = emailAddress;
			this.courseId = courseId;
		}
	public Teacher(int id, String name, String emailAddress, int courseId) {
		super();
		this.id = id;
		this.name = name;
		this.emailAddress = emailAddress;
		this.courseId = courseId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", emailAddress=" + emailAddress + ", courseId=" + courseId
				+ "]";
	}
	  
}
