package com.zensar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.JsonOrderEntity;

public interface JsonOrderMessageConsumerRepo extends JpaRepository<JsonOrderEntity, Integer> {

}
