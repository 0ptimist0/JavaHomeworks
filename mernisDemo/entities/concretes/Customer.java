package mernisDemo.entities.concretes;

import mernisDemo.entities.abstracts.Entity;

public class Customer implements Entity {
	private int id;
	private String name;
	private String lastName;
	private int yearOfBird;
	private String nationalityId;

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getYearOfBird() {
		return yearOfBird;
	}

	public void setYearOfBird(int yearOfBird) {
		this.yearOfBird = yearOfBird;
	}

}
