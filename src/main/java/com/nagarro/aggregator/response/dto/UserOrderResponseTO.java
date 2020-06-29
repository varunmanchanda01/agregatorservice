package com.nagarro.aggregator.response.dto;

import java.io.Serializable;
import java.util.List;

public class UserOrderResponseTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserDetailsResponseTO userDetails;

	private List<OrderDetailsResponseTO> orders;

	public List<OrderDetailsResponseTO> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderDetailsResponseTO> orders) {
		this.orders = orders;
	}

	public UserDetailsResponseTO getUserDetails() {
		return userDetails;
	}

	public void setDetailsResponseTO(UserDetailsResponseTO userDetails) {
		this.userDetails = userDetails;
	}

}
