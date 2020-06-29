package com.nagarro.aggregator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.aggregator.response.dto.UserOrderResponseTO;
import com.nagarro.aggregator.service.UserOrderService;

@RestController
public class UserOrderController {

	@Autowired
	private UserOrderService userOrderService;

	@GetMapping(value = "/orderdetails/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserOrderResponseTO> getUserOrderDetails(@PathVariable("id") String id) {
		return new ResponseEntity<>(userOrderService.getUserOrderDetails(Long.parseLong(id)), HttpStatus.OK);
	}

}
