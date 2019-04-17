package com.example.demo.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	 
	  @Column(name = "name")
	  private String name;
	 
	  @Column(name = "creditnumber")
	  private int creditnumber;
	  
	  protected Course()
	  {
		  super();
	  }


		public Course( String name, int creditnumber) {
			super();
			this.name = name;
			this.creditnumber = creditnumber;
		}
	public Course(int id, String name, int creditnumber) {
		super();
		this.id = id;
		this.name = name;
		this.creditnumber = creditnumber;
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

	public int getCreditnumber() {
		return creditnumber;
	}

	public void setCreditnumber(int creditnumber) {
		this.creditnumber = creditnumber;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", creditnumber=" + creditnumber + "]";
	}
	  
	  

}
