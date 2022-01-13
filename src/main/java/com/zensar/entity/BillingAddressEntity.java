package com.zensar.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BillingAddressEntity implements Serializable {

	@Id
	@GeneratedValue
	public int billingAddress_id;
	
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.LAZY)
	@JoinColumn(name = "contact_id")
	public ContactEntity contact;
	
	
	@Override
	public String toString() {
		return "BillingAddressEntity [billingAddress_id=" + billingAddress_id + ", contact=" + contact + "]";
	}

	public BillingAddressEntity(ContactEntity contact) {
		this.contact = contact;
	}

	public int getBillingAddress_id() {
		return billingAddress_id;
	}

	public void setBillingAddress_id(int billingAddress_id) {
		this.billingAddress_id = billingAddress_id;
	}

	public BillingAddressEntity() {
	}

	public ContactEntity getContact() {
		return contact;
	}

	public void setContact(ContactEntity contact) {
		this.contact = contact;
	}

	public BillingAddressEntity(int billingAddress_id, ContactEntity contact) {
		super();
		this.billingAddress_id = billingAddress_id;
		this.contact = contact;
	}

	
}
