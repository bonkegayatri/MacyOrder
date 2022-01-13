package com.zensar.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class SourceEntity implements Serializable {
	
	@Id
	@GeneratedValue
	public int source_id;

	public String clientID;
	public String subClientID;
	public String sellingChannelCode;
	public int seperatorSource0;
	public int separatorSource1;
	
	
	public SourceEntity() {
	}


	public SourceEntity(int source_id, String clientID, String subClientID, String sellingChannelCode,
			int seperatorSource0, int separatorSource1) {
		super();
		this.source_id = source_id;
		this.clientID = clientID;
		this.subClientID = subClientID;
		this.sellingChannelCode = sellingChannelCode;
		this.seperatorSource0 = seperatorSource0;
		this.separatorSource1 = separatorSource1;
	}


	
	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getSubClientID() {
		return subClientID;
	}

	public void setSubClientID(String subClientID) {
		this.subClientID = subClientID;
	}

	public String getSellingChannelCode() {
		return sellingChannelCode;
	}

	public void setSellingChannelCode(String sellingChannelCode) {
		this.sellingChannelCode = sellingChannelCode;
	}

	public int getSeperatorSource0() {
		return seperatorSource0;
	}

	public void setSeperatorSource0(int seperatorSource0) {
		this.seperatorSource0 = seperatorSource0;
	}

	public int getSeparatorSource1() {
		return separatorSource1;
	}

	public void setSeparatorSource1(int separatorSource1) {
		this.separatorSource1 = separatorSource1;
	}


	@Override
	public String toString() {
		return "SourceEntity [source_id=" + source_id + ", clientID=" + clientID + ", subClientID=" + subClientID
				+ ", sellingChannelCode=" + sellingChannelCode + ", seperatorSource0=" + seperatorSource0
				+ ", separatorSource1=" + separatorSource1 + "]";
	}


	public int getSource_id() {
		return source_id;
	}


	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}

	
	
	
}
