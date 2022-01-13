package com.zensar.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrderTotalsEntity implements Serializable {
	@Id
	@GeneratedValue
	public int order_totals_id;
	
	public double totalPurchaseAmount;
	public int seperatorOrderTotals0;
	
	
	
	public OrderTotalsEntity() {
		
	}
	
	
	
	public OrderTotalsEntity(int order_totals_id, double totalPurchaseAmount, int seperatorOrderTotals0) {
		super();
		this.order_totals_id = order_totals_id;
		this.totalPurchaseAmount = totalPurchaseAmount;
		this.seperatorOrderTotals0 = seperatorOrderTotals0;
	}



	public double getTotalPurchaseAmount() {
		return totalPurchaseAmount;
	}

	public void setTotalPurchaseAmount(double totalPurchaseAmount) {
		this.totalPurchaseAmount = totalPurchaseAmount;
	}

	public int getSeperatorOrderTotals0() {
		return seperatorOrderTotals0;
	}

	public void setSeperatorOrderTotals0(int seperatorOrderTotals0) {
		this.seperatorOrderTotals0 = seperatorOrderTotals0;
	}

	public OrderTotalsEntity(double totalPurchaseAmount, int seperatorOrderTotals0) {
		this.totalPurchaseAmount = totalPurchaseAmount;
		this.seperatorOrderTotals0 = seperatorOrderTotals0;
	}



	public int getOrder_totals_id() {
		return order_totals_id;
	}



	public void setOrder_totals_id(int order_totals_id) {
		this.order_totals_id = order_totals_id;
	}



	@Override
	public String toString() {
		return "OrderTotalsEntity [order_totals_id=" + order_totals_id + ", totalPurchaseAmount=" + totalPurchaseAmount
				+ ", seperatorOrderTotals0=" + seperatorOrderTotals0 + "]";
	}



	
	
}
