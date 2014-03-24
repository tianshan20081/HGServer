/**
 * 
 */
package com.aoeng.huigu.model;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author paynet Mar 19, 2014 3:12:16 PM 促销快报 产品信息
 */
public class Topic  implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5828606452342093664L;
	private int id;
	private String name;
	private String picUrl;

	public Topic() {
		super();
	}

	public Topic(int id, String name, String picUrl) {
		super();
		this.id = id;
		this.name = name;
		this.picUrl = picUrl;
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

	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", picUrl=" + picUrl + "]";
	}

}
