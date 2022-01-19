package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.XmlOrderDto;
import com.zensar.service.OrderService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	
	@PutMapping("/update/order_status/{orderID}/{orderStatus}")
	@ApiOperation(value = "Update Order Status")
	public ResponseEntity<String> updateOrderStatus(@PathVariable("orderID") int orderID, @PathVariable String orderStatus) {
	    return orderService.updateOrderStatus(orderID, orderStatus);
	}
	
	
}
