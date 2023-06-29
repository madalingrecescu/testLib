package com.madalin.Library.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class Authors {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "author_id")
	private int authorId;
	
	@Column(name = "author_name")
	private String authorName;
	
	@Column(name = "birthday")
	private LocalDate birthday;
	
	
	//constructors + getters setters
	
	public Authors() {
		
	}

	public Authors(int authorId, String authorName, LocalDate birthday) {
		this.authorId = authorId;
		this.authorName = authorName;
		this.birthday = birthday;
	}

	public int getAuthorId() {
		return authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	

	
	
}
