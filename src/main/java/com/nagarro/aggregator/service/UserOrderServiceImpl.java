package com.nagarro.aggregator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.aggregator.config.CommonConfiguration;
import com.nagarro.aggregator.response.dto.OrderDetailsResponseListTO;
import com.nagarro.aggregator.response.dto.UserDetailsResponseTO;
import com.nagarro.aggregator.response.dto.UserOrderResponseTO;

@Service
public class UserOrderServiceImpl implements UserOrderService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private CommonConfiguration commonConfiguration;

	@Override
	public UserOrderResponseTO getUserOrderDetails(Long userId) {
		StringBuilder userDetailsUrl = new StringBuilder(commonConfiguration.getUserDetailsStringUrl());
		StringBuilder orderDetailsUrl = new StringBuilder(commonConfiguration.getOrderDetailsStringUrl());

		UserDetailsResponseTO detailsResponseTO = restTemplate.getForObject(userDetailsUrl.append(userId).toString(),
				UserDetailsResponseTO.class);

		OrderDetailsResponseListTO orderDetailsResponseListTO = restTemplate
				.getForObject(orderDetailsUrl.append(userId).toString(), OrderDetailsResponseListTO.class);

		UserOrderResponseTO userOrderResponseTO = new UserOrderResponseTO();
		userOrderResponseTO.setDetailsResponseTO(detailsResponseTO);
		userOrderResponseTO.setOrders(orderDetailsResponseListTO.getOrders());

		return userOrderResponseTO;
	}

}
