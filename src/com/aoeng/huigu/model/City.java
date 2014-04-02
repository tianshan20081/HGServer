/**
 * 
 */
package com.aoeng.huigu.model;

import java.io.Serializable;

/**
 * @author paynet Apr 1, 2014 4:18:48 PM
 * 
 */
public class City implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1917929741582431384L;
	private int id;
	private int areaid;
	private int areapid;
	private String areaname;
	private int areatype;

	public City() {
		super();
	}

	public City(int areaid, int areapid, String areaname, int areatype) {
		super();
		this.areaid = areaid;
		this.areapid = areapid;
		this.areaname = areaname;
		this.areatype = areatype;
	}

	public City(int id, int areaid, int areapid, String areaname, int areatype) {
		super();
		this.id = id;
		this.areaid = areaid;
		this.areapid = areapid;
		this.areaname = areaname;
		this.areatype = areatype;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAreaid() {
		return areaid;
	}

	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}

	public int getAreapid() {
		return areapid;
	}

	public void setAreapid(int areapid) {
		this.areapid = areapid;
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public int getAreatype() {
		return areatype;
	}

	public void setAreatype(int areatype) {
		this.areatype = areatype;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", areaid=" + areaid + ", areapid=" + areapid + ", areaname=" + areaname + ", areatype=" + areatype + "]";
	}

}
