package com.luv2code.springdemo.mvc.table;



public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String hobby;
	private String favoriteLanguage;
	private int favoriteNumber;
	
	public Student(String firstName, String lastName, String country, String hobby, String favoriteLanguage,
			int favoriteNumber) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.hobby = hobby;
		this.favoriteLanguage = favoriteLanguage;
		this.favoriteNumber = favoriteNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public int getFavoriteNumber() {
		return favoriteNumber;
	}

	public void setFavoriteNumber(int favoriteNumber) {
		this.favoriteNumber = favoriteNumber;
	}
	
}