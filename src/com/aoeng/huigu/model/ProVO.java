/**
 * 
 */
package com.aoeng.huigu.model;

/**
 * @author paynet Apr 2, 2014 5:23:15 PM
 * 
 */
public class ProVO {
	private int id;
	private int proId;
	private int number;
	private OrderDetail orderDetail;

	public ProVO() {
		super();
	}

	public ProVO(int id, int proId, int number, OrderDetail orderDetail) {
		super();
		this.id = id;
		this.proId = proId;
		this.number = number;
		this.orderDetail = orderDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

	@Override
	public String toString() {
		return "ProVO [id=" + id + ", proId=" + proId + ", number=" + number + ", orderDetail=" + orderDetail + "]";
	}

}
