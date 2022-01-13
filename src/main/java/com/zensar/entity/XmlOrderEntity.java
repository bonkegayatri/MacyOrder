package com.zensar.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "XMLORDERCONSUMER")
public class XmlOrderEntity implements Serializable {
	
	@Id
	@GeneratedValue
	public int orderID;
	
	public String orderTypeCode;
	public String partnerOrderID;
	public String orderStatus;
	public LocalDate messageCreateTimeStamp;
	public String fulfillmentChannelCode;
	public int orderStatusCode;
	public String orderStatusDescription;
	public int sellZLDivisionNbr;
	public int sellZLLocationNbr;
	
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.LAZY)
	@JoinColumn(name = "source_id")
	public SourceEntity source;
	
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.LAZY)
	@JoinColumn(name = "order_totals_id")
	public OrderTotalsEntity orderTotals;
	
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.LAZY)
	@JoinColumn(name = "billingAddress_id")
	public BillingAddressEntity billingAddress;
	
	public String ns0;
	public String text;
	
	
	public XmlOrderEntity() {
	}


	public XmlOrderEntity(int orderID, String orderTypeCode, String partnerOrderID, String orderStatus,
			LocalDate messageCreateTimeStamp, String fulfillmentChannelCode, int orderStatusCode,
			String orderStatusDescription, int sellZLDivisionNbr, int sellZLLocationNbr, SourceEntity source,
			OrderTotalsEntity orderTotals, BillingAddressEntity billingAddress, String ns0, String text) {
		super();
		this.orderID = orderID;
		this.orderTypeCode = orderTypeCode;
		this.partnerOrderID = partnerOrderID;
		this.orderStatus = orderStatus;
		this.messageCreateTimeStamp = messageCreateTimeStamp;
		this.fulfillmentChannelCode = fulfillmentChannelCode;
		this.orderStatusCode = orderStatusCode;
		this.orderStatusDescription = orderStatusDescription;
		this.sellZLDivisionNbr = sellZLDivisionNbr;
		this.sellZLLocationNbr = sellZLLocationNbr;
		this.source = source;
		this.orderTotals = orderTotals;
		this.billingAddress = billingAddress;
		this.ns0 = ns0;
		this.text = text;
	}

	

	public XmlOrderEntity(int orderID, String orderTypeCode, String partnerOrderID, String orderStatus,
			LocalDate messageCreateTimeStamp, String fulfillmentChannelCode, int orderStatusCode,
			String orderStatusDescription, int sellZLDivisionNbr, int sellZLLocationNbr, String ns0, String text) {
		super();
		this.orderID = orderID;
		this.orderTypeCode = orderTypeCode;
		this.partnerOrderID = partnerOrderID;
		this.orderStatus = orderStatus;
		this.messageCreateTimeStamp = messageCreateTimeStamp;
		this.fulfillmentChannelCode = fulfillmentChannelCode;
		this.orderStatusCode = orderStatusCode;
		this.orderStatusDescription = orderStatusDescription;
		this.sellZLDivisionNbr = sellZLDivisionNbr;
		this.sellZLLocationNbr = sellZLLocationNbr;
		this.ns0 = ns0;
		this.text = text;
	}


	public String getNs0() {
		return ns0;
	}

	public void setNs0(String ns0) {
		this.ns0 = ns0;
	}

	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public int getOrderID() {
		return orderID;
	}


	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}


	public String getOrderTypeCode() {
		return orderTypeCode;
	}


	public void setOrderTypeCode(String orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}


	public String getPartnerOrderID() {
		return partnerOrderID;
	}


	public void setPartnerOrderID(String partnerOrderID) {
		this.partnerOrderID = partnerOrderID;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public LocalDate getMessageCreateTimeStamp() {
		return messageCreateTimeStamp;
	}


	public void setMessageCreateTimeStamp(LocalDate messageCreateTimeStamp) {
		this.messageCreateTimeStamp = messageCreateTimeStamp;
	}


	public String getFulfillmentChannelCode() {
		return fulfillmentChannelCode;
	}


	public void setFulfillmentChannelCode(String fulfillmentChannelCode) {
		this.fulfillmentChannelCode = fulfillmentChannelCode;
	}


	public int getOrderStatusCode() {
		return orderStatusCode;
	}


	public void setOrderStatusCode(int orderStatusCode) {
		this.orderStatusCode = orderStatusCode;
	}


	public String getOrderStatusDescription() {
		return orderStatusDescription;
	}


	public void setOrderStatusDescription(String orderStatusDescription) {
		this.orderStatusDescription = orderStatusDescription;
	}


	public int getSellZLDivisionNbr() {
		return sellZLDivisionNbr;
	}


	public void setSellZLDivisionNbr(int sellZLDivisionNbr) {
		this.sellZLDivisionNbr = sellZLDivisionNbr;
	}


	public int getSellZLLocationNbr() {
		return sellZLLocationNbr;
	}


	public void setSellZLLocationNbr(int sellZLLocationNbr) {
		this.sellZLLocationNbr = sellZLLocationNbr;
	}


	public SourceEntity getSource() {
		return source;
	}


	public void setSource(SourceEntity source) {
		this.source = source;
	}


	public OrderTotalsEntity getOrderTotals() {
		return orderTotals;
	}


	public void setOrderTotals(OrderTotalsEntity orderTotals) {
		this.orderTotals = orderTotals;
	}


	public BillingAddressEntity getBillingAddress() {
		return billingAddress;
	}


	public void setBillingAddress(BillingAddressEntity billingAddress) {
		this.billingAddress = billingAddress;
	}



	@Override
	public String toString() {
		return "XmlOrderEntity [orderID=" + orderID + ", orderTypeCode=" + orderTypeCode + ", partnerOrderID="
				+ partnerOrderID + ", orderStatus=" + orderStatus + ", messageCreateTimeStamp=" + messageCreateTimeStamp
				+ ", fulfillmentChannelCode=" + fulfillmentChannelCode + ", orderStatusCode=" + orderStatusCode
				+ ", orderStatusDescription=" + orderStatusDescription + ", sellZLDivisionNbr=" + sellZLDivisionNbr
				+ ", sellZLLocationNbr=" + sellZLLocationNbr + ", source=" + source + ", orderTotals=" + orderTotals
				+ ", billingAddress=" + billingAddress + ", ns0=" + ns0 + ", text=" + text + "]";
	}


	
	
	
	
}
