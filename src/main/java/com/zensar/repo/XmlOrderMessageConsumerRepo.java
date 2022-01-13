package com.zensar.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.zensar.entity.XmlOrderEntity;

public interface XmlOrderMessageConsumerRepo extends JpaRepository<XmlOrderEntity, Integer>{

	@Transactional
	@Modifying
	@Query("UPDATE XmlOrderEntity SET orderStatus = :orderStatus WHERE orderID = :orderID")
	Integer updateOrderStatusByOrderId(String orderStatus, int orderID);
	
}
