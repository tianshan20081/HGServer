/**
 * 
 */
package com.aoeng.huigu.model;

import java.util.Arrays;
import java.util.Date;

/**
 * @author paynet Mar 17, 2014 1:41:37 PM
 * 
 */
public class Product {
	/* 商品ID */
	private int id;
	/* 商品名称 */
	private String name;
	/* 銷量 */
	private int sales;
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
	/* 上架時間 */
	private Date pubDate;
	/* 是否促销 促销 则为 true ,否则为false 默认为 false */
	private boolean topic = false;
	/* 推荐品牌 则为 true ,否则为false 默认为 false */
	private boolean brand = false;
	/* 显示售卖 则为 true ,否则为false 默认为 false */
	private boolean limitBuy = false ;

	public Product() {
		super();
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

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
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

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public boolean isTopic() {
		return topic;
	}

	public void setTopic(boolean topic) {
		this.topic = topic;
	}

	public boolean isBrand() {
		return brand;
	}

	public void setBrand(boolean brand) {
		this.brand = brand;
	}

	public boolean isLimitBuy() {
		return limitBuy;
	}


	public void setLimitBuy(boolean limitBuy) {
		this.limitBuy = limitBuy;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", sales=" + sales + ", marketPrice=" + marketPrice + ", pic=" + Arrays.toString(pic) + ", price=" + price + ", limitPrice=" + limitPrice
				+ ", leftTime=" + leftTime + ", score=" + score + ", available=" + available + ", buyLimit=" + buyLimit + ", commentCount=" + commentCount + ", inventoryArea=" + inventoryArea
				+ ", bigPic=" + Arrays.toString(bigPic) + ", pubDate=" + pubDate + ", topic=" + topic + ", brand=" + brand + ", limitBuy=" + limitBuy + "]";
	}


	

}
