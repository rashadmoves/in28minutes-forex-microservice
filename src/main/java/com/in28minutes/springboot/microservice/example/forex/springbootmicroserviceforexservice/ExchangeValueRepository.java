package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
//	@Query
	ExchangeValue findByFromAndTo(String from, String to);

}
