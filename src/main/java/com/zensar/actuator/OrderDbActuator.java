package com.zensar.actuator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import com.zensar.repo.JsonOrderMessageConsumerRepo;
import com.zensar.repo.XmlOrderMessageConsumerRepo;

@Component
@Endpoint(id="orderStatistics")
public class OrderDbActuator {

	@Autowired
	XmlOrderMessageConsumerRepo xmlOrderRepo;

	@Autowired
	JsonOrderMessageConsumerRepo jsonOrderRepo;

	@ReadOperation
	public String getAllOrderStatistics(){
		return "Xml Order Count: " + xmlOrderRepo.count() + "\nJson Order Count: " + jsonOrderRepo.count();
	}
	

}
