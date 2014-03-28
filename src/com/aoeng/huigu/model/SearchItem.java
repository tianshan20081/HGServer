/**
 * 
 */
package com.aoeng.huigu.model;

/**
 * @author paynet Mar 18, 2014 11:12:29 AM 搜索 产品 子条目信息
 */
public class SearchItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4426377226419577397L;
	private int id;
	private String name;
	private String pic;
	private double price;
	private double marketPrice;
	private int sales ;
	
	
	/**
	 * 
	 */
	public SearchItem() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param pic
	 * @param price
	 * @param marketPrice
	 * @param sales
	 */
	public SearchItem(int id, String name, String pic, double price, double marketPrice, int sales) {
		super();
		this.id = id;
		this.name = name;
		this.pic = pic;
		this.price = price;
		this.marketPrice = marketPrice;
		this.sales = sales;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pic
	 */
	public String getPic() {
		return pic;
	}
	/**
	 * @param pic the pic to set
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the marketPrice
	 */
	public double getMarketPrice() {
		return marketPrice;
	}
	/**
	 * @param marketPrice the marketPrice to set
	 */
	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}
	/**
	 * @return the sales
	 */
	public int getSales() {
		return sales;
	}
	/**
	 * @param sales the sales to set
	 */
	public void setSales(int sales) {
		this.sales = sales;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SearchItem [id=" + id + ", name=" + name + ", pic=" + pic + ", price=" + price + ", marketPrice=" + marketPrice + ", sales=" + sales + "]";
	}
}
