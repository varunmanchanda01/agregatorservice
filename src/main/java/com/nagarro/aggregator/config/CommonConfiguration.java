package com.nagarro.aggregator.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {

	@Value("${USERDETAILS_URL}")
	private String userDetailsStringUrl;
	
	@Value("${ORDERDETAILS_URL}")
	private String orderDetailsStringUrl;

	public String getOrderDetailsStringUrl() {
		return orderDetailsStringUrl;
	}

	public void setOrderDetailsStringUrl(String orderDetailsStringUrl) {
		this.orderDetailsStringUrl = orderDetailsStringUrl;
	}

	public String getUserDetailsStringUrl() {
		return userDetailsStringUrl;
	}

	public void setUserDetailsStringUrl(String userDetailsStringUrl) {
		this.userDetailsStringUrl = userDetailsStringUrl;
	}
	
	
	

}
