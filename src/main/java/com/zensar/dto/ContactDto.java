package com.zensar.dto;

public class ContactDto {

	public int custID;
	public NameDto name;
	public AddressDto address;
	public String daytimePhoneNbr;
	public String homePhoneNbr;
	public String alternatePhoneNbr;
	public boolean sendSMSMessage;
	public String emailAddress;
	public int seperatorContact0;
	
	
	public ContactDto() {
	}


	public ContactDto(int custID, NameDto name, AddressDto address, String daytimePhoneNbr, String homePhoneNbr,
			String alternatePhoneNbr, boolean sendSMSMessage, String emailAddress, int seperatorContact0) {
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


	public int getCustID() {
		return custID;
	}


	public void setCustID(int custID) {
		this.custID = custID;
	}


	public NameDto getName() {
		return name;
	}


	public void setName(NameDto name) {
		this.name = name;
	}


	public AddressDto getAddress() {
		return address;
	}


	public void setAddress(AddressDto address) {
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
		return "Contact [custID=" + custID + ", name=" + name + ", address=" + address + ", daytimePhoneNbr="
				+ daytimePhoneNbr + ", homePhoneNbr=" + homePhoneNbr + ", alternatePhoneNbr=" + alternatePhoneNbr
				+ ", sendSMSMessage=" + sendSMSMessage + ", emailAddress=" + emailAddress + ", seperatorContact0="
				+ seperatorContact0 + "]";
	}
	
	
	
}
