package com.zensar.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zensar.repo.XmlOrderMessageConsumerRepo;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	XmlOrderMessageConsumerRepo xmlOrderMessageRepo;
	
	@Lazy
	@Autowired
	ModelMapper modelMapper;

	@Bean
	public ModelMapper modelMapper() {
	 return new ModelMapper();
	}
	
	@Override
	public ResponseEntity<String> updateOrderStatus(int orderID, String orderStatus) {
		return new ResponseEntity<String>(xmlOrderMessageRepo.updateOrderStatusByOrderId(orderStatus, orderID) +" record(s) updated.", HttpStatus.OK);
	}
	
	

}
