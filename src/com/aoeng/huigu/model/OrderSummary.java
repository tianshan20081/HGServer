/**
 * 
 */
package com.aoeng.huigu.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author paynet Apr 2, 2014 5:09:45 PM 订单概括
 */
public class OrderSummary implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2282818106221471960L;
	
	private int id;
	private double amount;
	private String iconUrl;
	private Date createTime;
	private String status;

	public OrderSummary() {
		super();
	}

	public OrderSummary(int id, double amount, String iconUrl, Date createTime, String status) {
		super();
		this.id = id;
		this.amount = amount;
		this.iconUrl = iconUrl;
		this.createTime = createTime;
		this.status = status;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "OrderSummary [id=" + id + ", amount=" + amount + ", iconUrl=" + iconUrl + ", createTime=" + createTime + ", status=" + status + "]";
	}

}
