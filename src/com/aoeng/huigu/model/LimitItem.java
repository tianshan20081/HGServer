/**
 * 
 */
package com.aoeng.huigu.model;

/**
 * @author paynet Mar 19, 2014 4:09:33 PM
 * 
 */
public class LimitItem {
	/* id */
	private int id;
	/* 标题 */
	private String name;
	/* 图片Url */
	private String picUrl;
	/* 价格 */
	private double price;
	/* 限时价格 */
	private double limitPrice;
	/* 剩余时间 单位 秒 */
	private long limitTime;

	public LimitItem() {
		super();
	}

	public LimitItem(int id, String name, String picUrl, double price, double limitPrice, long limitTime) {
		super();
		this.id = id;
		this.name = name;
		this.picUrl = picUrl;
		this.price = price;
		this.limitPrice = limitPrice;
		this.limitTime = limitTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getLimitPrice() {
		return limitPrice;
	}

	public void setLimitPrice(double limitPrice) {
		this.limitPrice = limitPrice;
	}

	public long getLimitTime() {
		return limitTime;
	}

	public void setLimitTime(long limitTime) {
		this.limitTime = limitTime;
	}

	@Override
	public String toString() {
		return "LimitItem [id=" + id + ", name=" + name + ", picUrl=" + picUrl + ", price=" + price + ", limitPrice=" + limitPrice + ", limitTime=" + limitTime + "]";
	}

}
