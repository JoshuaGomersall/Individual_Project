package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BackStory")
public class BackStory {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String hook = "John";
	private String hometown = "";
	private String farther = "";
	private String mother = "";

	public BackStory() {
	}

	public BackStory(Long id, String hook, String hometown, String farther, String mother) {
		super();
		this.id = id;
		this.hook = hook;
		this.hometown = hometown;
		this.farther = farther;
		this.mother = mother;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHook() {
		return hook;
	}

	public void setHook(String hook) {
		this.hook = hook;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getFarther() {
		return farther;
	}

	public void setFarther(String farther) {
		this.farther = farther;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

}
