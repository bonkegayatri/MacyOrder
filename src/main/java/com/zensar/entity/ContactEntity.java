package com.zensar.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ContactEntity {

	@Id
	@GeneratedValue
	public int contact_id;

	public int custID;
	
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.LAZY)
	@JoinColumn(name = "name_id")
	public NameEntity name;
	
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.LAZY)
	@JoinColumn(name = "address_id")
	public AddresseEntity address;
	
	public String daytimePhoneNbr;
	public String homePhoneNbr;
	public String alternatePhoneNbr;
	public boolean sendSMSMessage;
	public String emailAddress;
	public int seperatorContact0;
	

	
	public ContactEntity() {
	}


	

	public ContactEntity(int contact_id, int custID, NameEntity name, AddresseEntity address, String daytimePhoneNbr,
			String homePhoneNbr, String alternatePhoneNbr, boolean sendSMSMessage, String emailAddress,
			int seperatorContact0) {
		super();
		this.contact_id = contact_id;
		this.custID = custID;
		this.name = name;
		this.address = address;
		this.daytimePhoneNbr = daytimePhoneNbr;
		this.homePhoneNbr = homePhoneNbr;
		this.alternatePhoneNbr = alternatePhoneNbr;
		this.sendSMSMessage = sendSMSMessage;
		this.emailAddress = emailAddress;
		this.seperatorContact0 = seperatorContact0;
	}




	public ContactEntity(int contact_id, int custID, String daytimePhoneNbr, String homePhoneNbr,
			String alternatePhoneNbr, boolean sendSMSMessage, String emailAddress, int seperatorContact0) {
		super();
		this.contact_id = contact_id;
		this.custID = custID;
		this.daytimePhoneNbr = daytimePhoneNbr;
		this.homePhoneNbr = homePhoneNbr;
		this.alternatePhoneNbr = alternatePhoneNbr;
		this.sendSMSMessage = sendSMSMessage;
		this.emailAddress = emailAddress;
		this.seperatorContact0 = seperatorContact0;
	}




	public int getCustID() {
		return custID;
	}


	public void setCustID(int custID) {
		this.custID = custID;
	}


	public NameEntity getName() {
		return name;
	}


	public void setName(NameEntity name) {
		this.name = name;
	}


	public AddresseEntity getAddress() {
		return address;
	}


	public void setAddress(AddresseEntity address) {
		this.address = address;
	}


	public String getDaytimePhoneNbr() {
		return daytimePhoneNbr;
	}


	public void setDaytimePhoneNbr(String daytimePhoneNbr) {
		this.daytimePhoneNbr = daytimePhoneNbr;
	}


	public String getHomePhoneNbr() {
		return homePhoneNbr;
	}


	public void setHomePhoneNbr(String homePhoneNbr) {
		this.homePhoneNbr = homePhoneNbr;
	}


	public String getAlternatePhoneNbr() {
		return alternatePhoneNbr;
	}


	public void setAlternatePhoneNbr(String alternatePhoneNbr) {
		this.alternatePhoneNbr = alternatePhoneNbr;
	}


	public boolean isSendSMSMessage() {
		return sendSMSMessage;
	}


	public void setSendSMSMessage(boolean sendSMSMessage) {
		this.sendSMSMessage = sendSMSMessage;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public int getSeperatorContact0() {
		return seperatorContact0;
	}


	public void setSeperatorContact0(int seperatorContact0) {
		this.seperatorContact0 = seperatorContact0;
	}




	@Override
	public String toString() {
		return "ContactEntity [contact_id=" + contact_id + ", custID=" + custID + ", name=" + name + ", address="
				+ address + ", daytimePhoneNbr=" + daytimePhoneNbr + ", homePhoneNbr=" + homePhoneNbr
				+ ", alternatePhoneNbr=" + alternatePhoneNbr + ", sendSMSMessage=" + sendSMSMessage + ", emailAddress="
				+ emailAddress + ", seperatorContact0=" + seperatorContact0 + "]";
	}




	public int getContact_id() {
		return contact_id;
	}




	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}


	
	
	
}
