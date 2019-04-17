package com.example.demo.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	 
	  @Column(name = "name")
	  private String name;
	 
	  @Column(name = "email")
	  private String emailAddress;
	  @Column(name = "courseid")
	  private int courseId;
	  @Column(name = "academicid")
	  private int academicId;
	  
	protected Student() {
		super();
	}

	public Student(String name, String emailAddress) {
		super();
		this.name = name;
		this.emailAddress = emailAddress;
		this.courseId = 1;
		this.academicId = 1;
	}
	public Student(String name, String emailAddress,int courseId,int academicId) {
		super();
		this.name = name;
		this.emailAddress = emailAddress;
		this.courseId = courseId;
		this.academicId = academicId;
	}

	public Student(int id, String name, String emailAddress, int courseId, int academicId) {
		super();
		this.id = id;
		this.name = name;
		this.emailAddress = emailAddress;
		this.courseId = courseId;
		this.academicId = academicId;
	}

	public long getId() {
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

	public int getAcademicId() {
		return academicId;
	}

	public void setAcademicId(int academicId) {
		this.academicId = academicId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", emailAddress=" + emailAddress + ", courseId=" + courseId
				+ ", academicId=" + academicId + "]";
	}
	

	
	  
	  

}
