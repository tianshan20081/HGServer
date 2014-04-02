/**
 * 
 */
package com.aoeng.huigu.model;

import java.util.Date;

/**
 * @author paynet Apr 2, 2014 5:09:45 PM 订单概括
 */
public class OrderSummary {

	private int id;
	private double amount;
	private String iconUrl;
	private Date orderTime;
	private String orderStatus;

	public OrderSummary() {
		super();
	}

	public OrderSummary(int id, double amount, String iconUrl, Date orderTime, String orderStatus) {
		super();
		this.id = id;
		this.amount = amount;
		this.iconUrl = iconUrl;
		this.orderTime = orderTime;
		this.orderStatus = orderStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "OrderSummary [id=" + id + ", amount=" + amount + ", iconUrl=" + iconUrl + ", orderTime=" + orderTime + ", orderStatus=" + orderStatus + "]";
	}

}
