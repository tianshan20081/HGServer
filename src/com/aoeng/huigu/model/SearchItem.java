/**
 * 
 */
package com.aoeng.huigu.model;

/**
 * @author paynet Mar 18, 2014 11:12:29 AM 搜索 产品 子条目信息
 */
public class SearchItem {
	private int id;
	private String name;
	private String pic;
	private double price;
	private double marketPrice;

	public SearchItem() {
		super();
	}

	public SearchItem(int id, String name, String pic, double price, double marketPrice) {
		super();
		this.id = id;
		this.name = name;
		this.pic = pic;
		this.price = price;
		this.marketPrice = marketPrice;
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

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}

	@Override
	public String toString() {
		return "SearchItem []";
	}

}
