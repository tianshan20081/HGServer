/**
 * 
 */
package com.aoeng.huigu.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author paynet Apr 2, 2014 5:10:27 PM 订单详情
 */
public class OrderDetail {

	private int id;
	private double amount;
	private Date orderTime;
	private String orderStatus;
	private Set<ProVO> pros = new HashSet<ProVO>();

	public OrderDetail() {
		super();
	}

	public OrderDetail(int id, double amount, Date orderTime, String orderStatus, Set<ProVO> pros) {
		super();
		this.id = id;
		this.amount = amount;
		this.orderTime = orderTime;
		this.orderStatus = orderStatus;
		this.pros = pros;
	}

	public void addProVo(ProVO vo) {
		this.pros.add(vo);
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

	public Set<ProVO> getPros() {
		return pros;
	}

	public void setPros(Set<ProVO> pros) {
		this.pros = pros;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", amount=" + amount + ", orderTime=" + orderTime + ", orderStatus=" + orderStatus + "]";
	}

}
