/**
 * 
 */
package com.aoeng.huigu.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author paynet Mar 17, 2014 1:41:37 PM
 * 
 */
public class Product {
	/* 商品ID */
	private int id;
	/* 商品名称 */
	private String name;
	/* 市场价 */
	private double marketPrice;
	/* 商品图片 */
	private String[] pic;
	/* 会员价 */
	private double price;
	/* 限时抢购价 */
	private double limitPrice;
	/* 剩余时间，单位秒 */
	private long leftTime;
	/* 商品评分 */
	private double score;
	/* 是否可售 */
	private boolean available;
	/* 单品购买上限 */
	private int buyLimit;
	/* 评论总数 */
	private int commentCount;
	/* 可发送至配货说明 */
	private String inventoryArea;
	/* 商品大图 */
	private String[] bigPic;

	public Product() {
		super();
	}

	public Product(int id, String name, double marketPrice, String[] pic, double price, double limitPrice, long leftTime, double score, boolean available, int buyLimit, int commentCount,
			String inventoryArea, String[] bigPic) {
		super();
		this.id = id;
		this.name = name;
		this.marketPrice = marketPrice;
		this.pic = pic;
		this.price = price;
		this.limitPrice = limitPrice;
		this.leftTime = leftTime;
		this.score = score;
		this.available = available;
		this.buyLimit = buyLimit;
		this.commentCount = commentCount;
		this.inventoryArea = inventoryArea;
		this.bigPic = bigPic;
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

	public double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String[] getPic() {
		return pic;
	}

	public void setPic(String[] pic) {
		this.pic = pic;
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

	public long getLeftTime() {
		return leftTime;
	}

	public void setLeftTime(long leftTime) {
		this.leftTime = leftTime;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getBuyLimit() {
		return buyLimit;
	}

	public void setBuyLimit(int buyLimit) {
		this.buyLimit = buyLimit;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public String getInventoryArea() {
		return inventoryArea;
	}

	public void setInventoryArea(String inventoryArea) {
		this.inventoryArea = inventoryArea;
	}

	public String[] getBigPic() {
		return bigPic;
	}

	public void setBigPic(String[] bigPic) {
		this.bigPic = bigPic;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", marketPrice=" + marketPrice + ", pic=" + Arrays.toString(pic) + ", price=" + price + ", limitPrice=" + limitPrice + ", leftTime=" + leftTime
				+ ", score=" + score + ", available=" + available + ", buyLimit=" + buyLimit + ", commentCount=" + commentCount + ", inventoryArea=" + inventoryArea + ", bigPic="
				+ Arrays.toString(bigPic) + "]";
	}

}
