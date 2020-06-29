package com.nagarro.aggregator.response.dto;

import java.io.Serializable;

public class OrderDetailsResponseTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long orderId;

	private Integer orderAmount;

	private String orderDate;

	public OrderDetailsResponseTO(Long orderId, Integer orderAmount, String orderDate) {
		super();
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}

	public OrderDetailsResponseTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

}
