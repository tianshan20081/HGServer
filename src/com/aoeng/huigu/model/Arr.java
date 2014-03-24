/**
 * 
 */
package com.aoeng.huigu.model;

import java.io.Serializable;

/**
 * Mar 21, 20144:51:27 PM
 * 
 */
public class Arr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4128781863386343813L;

	private String name;
	private String url;
	private String img;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the img
	 */
	public String getImg() {
		return img;
	}

	/**
	 * @param img
	 *            the img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Arr [name=" + name + ", url=" + url + ", img=" + img + "]";
	}

}
