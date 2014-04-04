/**
 * 
 */
package com.aoeng.huigu.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author paynet Apr 2, 2014 5:10:27 PM 订单详情
 */
public class OrderDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4830998934724458908L;
	private int id;
	/**
	 * 订单编号
	 */
	private String oid;
	/**
	 * 订单金额
	 */
	private double amount;
	/**
	 * 订单状态
	 */
	private String status;
	/**
	 * 订单总金额
	 */
	private double allAmount;
	/**
	 * 运费
	 */
	private double freight;
	/**
	 * 折扣
	 */
	private double discount;
	/**
	 * 商品集合
	 */
	private Set<ProVO> pros = new HashSet<ProVO>();
	/**
	 * 收货地址
	 */
	private String adsId;
	/**
	 * 支付方式
	 */
	private String payMethod;
	/**
	 * 快递名称
	 */
	private String transport;
	/**
	 * 快递单号
	 */
	private String transportId;
	/**
	 * 下单时间
	 */
	private Date createTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAllAmount() {
		return allAmount;
	}

	public void setAllAmount(double allAmount) {
		this.allAmount = allAmount;
	}

	public double getFreight() {
		return freight;
	}

	public void setFreight(double freight) {
		this.freight = freight;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Set<ProVO> getPros() {
		return pros;
	}

	public void setPros(Set<ProVO> pros) {
		this.pros = pros;
	}


	

	public String getAdsId() {
		return adsId;
	}

	public void setAdsId(String adsId) {
		this.adsId = adsId;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getTransportId() {
		return transportId;
	}

	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", oid=" + oid + ", amount=" + amount + ", status=" + status + ", allAmount=" + allAmount + ", freight=" + freight + ", discount=" + discount + ", adsId="
				+ adsId + ", payMethod=" + payMethod + ", transport=" + transport + ", transportId=" + transportId + ", createTime=" + createTime + "]";
	}


	
}
