package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AddresseEntity {

	@Id
	@GeneratedValue
	public int address_id;
	
	public String line1;
	public String line2;
	public String line3;
	public String city;
	public String state;
	public int zipCode;
	public String countryCode;
	public int seperatorAddress0;
	
	
	public AddresseEntity() {
	}


	public String getLine1() {
		return line1;
	}


	public void setLine1(String line1) {
		this.line1 = line1;
	}


	public String getLine2() {
		return line2;
	}


	public void setLine2(String line2) {
		this.line2 = line2;
	}


	public String getLine3() {
		return line3;
	}


	public void setLine3(String line3) {
		this.line3 = line3;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getZipCode() {
		return zipCode;
	}


	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public int getSeperatorAddress0() {
		return seperatorAddress0;
	}


	public void setSeperatorAddress0(int seperatorAddress0) {
		this.seperatorAddress0 = seperatorAddress0;
	}


	public int getAddress_id() {
		return address_id;
	}


	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}


	public AddresseEntity(int address_id, String line1, String line2, String line3, String city, String state,
			int zipCode, String countryCode, int seperatorAddress0) {
		super();
		this.address_id = address_id;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.countryCode = countryCode;
		this.seperatorAddress0 = seperatorAddress0;
	}


	@Override
	public String toString() {
		return "AddresseEntity [address_id=" + address_id + ", line1=" + line1 + ", line2=" + line2 + ", line3=" + line3
				+ ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", countryCode=" + countryCode
				+ ", seperatorAddress0=" + seperatorAddress0 + "]";
	}


	
}
