package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "exchange_value")
public class ExchangeValue {

	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	private BigDecimal conversionMultiple;
	private int port;
	
	public ExchangeValue() {
		// TODO Auto-generated constructor stub
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
	  super();
	  this.id = id;
	  this.from = from;
	  this.to = to;
	  this.conversionMultiple = conversionMultiple;
	
	}
	
	public Long getId() {
	    return id;
	  }

	  public String getFrom() {
	    return from;
	  }
	  
//	  public String findFrom() {
//		    return getFrom();
//		 }

	  public String getTo() {
	    return to;
	  }

	  public BigDecimal getConversionMultiple() {
	    return conversionMultiple;
	  }
	  
	  public int getPort() {
	    return port;
	  }

	  public void setPort(int port) {
	    this.port = port;
	  }
}
