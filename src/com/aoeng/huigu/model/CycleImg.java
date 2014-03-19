/**
 * 
 */
package com.aoeng.huigu.model;

import java.util.concurrent.ThreadLocalRandom;

import net.sf.cglib.core.Local;

/**
 * @author paynet Mar 17, 2014 11:57:23 AM 首页 轮转大图
 */
public class CycleImg {

	private int id;
	private String title;
	private String picUrl;

	public CycleImg() {
		super();
		
	}

	public CycleImg(int id, String title, String picUrl) {
		super();
		this.id = id;
		this.title = title;
		this.picUrl = picUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	@Override
	public String toString() {
		return "CycleImg [id=" + id + ", title=" + title + ", picUrl=" + picUrl + "]";
	}

}
