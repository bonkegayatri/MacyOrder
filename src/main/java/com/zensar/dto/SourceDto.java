package com.zensar.dto;

public class SourceDto {
	public String clientID;
	public String subClientID;
	public String sellingChannelCode;
	public int seperatorSource0;
	public int separatorSource1;
	
	public SourceDto() {
	}

	public SourceDto(String clientID, String subClientID, String sellingChannelCode, int seperatorSource0,
			int separatorSource1) {
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
		return "Source [clientID=" + clientID + ", subClientID=" + subClientID + ", sellingChannelCode="
				+ sellingChannelCode + ", seperatorSource0=" + seperatorSource0 + ", separatorSource1="
				+ separatorSource1 + "]";
	}
	
	
}
