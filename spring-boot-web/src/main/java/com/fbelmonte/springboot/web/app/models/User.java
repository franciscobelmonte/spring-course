package com.fbelmonte.springboot.web.app.models;

public class User {
	
	private String name;
	private String surnames;
	private String email;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurnames() {
		return surnames;
	}
	
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
