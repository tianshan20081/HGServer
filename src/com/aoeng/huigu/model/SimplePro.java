/**
 * 
 */
package com.aoeng.huigu.model;

/**
 * @author paynet  Mar 17, 2014 5:45:27 PM
 *  简单的 商品信息，
 */
public class SimplePro {
	private int id ;
	private String name ;
	private String picUrl ;
	private String type ;
	
	
	public SimplePro() {
		super();
	}
	public SimplePro(int id, String name, String picUrl, String type) {
		super();
		this.id = id;
		this.name = name;
		this.picUrl = picUrl;
		this.type = type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "SimplePro [id=" + id + ", name=" + name + ", picUrl=" + picUrl + ", type=" + type + "]";
	}
	
	
	
}
