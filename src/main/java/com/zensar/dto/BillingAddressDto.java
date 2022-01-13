package com.zensar.dto;

public class BillingAddressDto {

	public ContactDto contact;

	@Override
	public String toString() {
		return "BillingAddress [contact=" + contact + "]";
	}

	public BillingAddressDto(ContactDto contact) {
		this.contact = contact;
	}

	public BillingAddressDto() {
	}

	public ContactDto getContact() {
		return contact;
	}

	public void setContact(ContactDto contact) {
		this.contact = contact;
	}

	
}
