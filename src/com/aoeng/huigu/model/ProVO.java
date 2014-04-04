/**
 * 
 */
package com.aoeng.huigu.model;

import java.io.Serializable;

/**
 * @author paynet Apr 2, 2014 5:23:15 PM
 * 
 */
public class ProVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1647200420505087773L;
	private int id;
	private int proId;
	private int number;

	public ProVO() {
		super();
	}

	
	public ProVO(int proId, int number) {
		super();
		this.proId = proId;
		this.number = number;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}



}
