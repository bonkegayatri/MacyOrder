package com.zensar.service;

import org.springframework.http.ResponseEntity;

public interface OrderService {

	public ResponseEntity<String> updateOrderStatus(int orderID, String orderStatus);
	
}
