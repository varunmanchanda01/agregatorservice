package com.nagarro.aggregator.service;

import org.springframework.stereotype.Service;

import com.nagarro.aggregator.response.dto.UserOrderResponseTO;

@Service
public interface UserOrderService {

	public UserOrderResponseTO getUserOrderDetails(Long userId);

}
