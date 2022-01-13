package com.zensar.dto;

public class NameDto {

	public String firstName;
	public String lastName;
	public int seperatorName0;
	public int seperatorName1;
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public NameDto() {
	}


	public NameDto(String firstName, String lastName, int seperatorName0, int seperatorName1) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.seperatorName0 = seperatorName0;
		this.seperatorName1 = seperatorName1;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getSeperatorName0() {
		return seperatorName0;
	}


	public void setSeperatorName0(int seperatorName0) {
		this.seperatorName0 = seperatorName0;
	}


	public int getSeperatorName1() {
		return seperatorName1;
	}


	public void setSeperatorName1(int seperatorName1) {
		this.seperatorName1 = seperatorName1;
	}


	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + ", seperatorName0=" + seperatorName0
				+ ", seperatorName1=" + seperatorName1 + "]";
	}
	
	
}
