package com.example.demo.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "academic_situation")
public class Academic_Situation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	@Column(name = "grade1")
	  private int grade1;
	@Column(name = "grade2")
	  private int grade2;
	@Column(name = "grade3")
	  private int grade3;
	
	protected Academic_Situation()
	{
		super();
	}

	public Academic_Situation(int id, int grade1, int grade2, int grade3) {
		super();
		this.id = id;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGrade1() {
		return grade1;
	}

	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}

	public int getGrade2() {
		return grade2;
	}

	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}

	public int getGrade3() {
		return grade3;
	}

	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}

	@Override
	public String toString() {
		return "Academic_Situation [id=" + id + ", grade1=" + grade1 + ", grade2=" + grade2 + ", grade3=" + grade3
				+ "]";
	}
	  
}
