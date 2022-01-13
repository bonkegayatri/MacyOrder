package com.zensar.dto;

public class OrderTotalsDto {
	public double totalPurchaseAmount;
	public int seperatorOrderTotals0;
	
	
	public OrderTotalsDto() {
		
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

	public OrderTotalsDto(double totalPurchaseAmount, int seperatorOrderTotals0) {
		this.totalPurchaseAmount = totalPurchaseAmount;
		this.seperatorOrderTotals0 = seperatorOrderTotals0;
	}


	@Override
	public String toString() {
		return "OrderTotals [totalPurchaseAmount=" + totalPurchaseAmount + ", seperatorOrderTotals0="
				+ seperatorOrderTotals0 + "]";
	}
	
	
}
