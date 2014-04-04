/**
 * 
 */
package com.aoeng.huigu.model;

/**
 * @author paynet Mar 19, 2014 12:22:50 PM 地址信息
 */
public class Address {
	/* id */
	private int id;
	/**
	 * 地址Id
	 */
	private String adsId;
	/* 收货人姓名 */
	private String name;
	/* 手机号码 */
	private String phone;
	/* 固定电话 */
	private String fixedTel;
	/* 省份ID */
	private int provinceId;
	/* 城市ID */
	private int cityId;
	/* 地区 ID */
	private int areaId;
	/* 详细地址 */
	private String areaDetail;
	/* 邮编 */
	private String zipCode;

	public Address() {
		super();
	}

	/**
	 * 
	 * @param adsId
	 *            地址 编号 ，不可重复(不可为空)
	 * @param name
	 *            收货人姓名(不可为空)
	 * @param phone
	 *            收货人电话(不可为空)
	 * @param fixedTel
	 *            收货人传真
	 * @param provinceId
	 *            收货人 省份 编号(不可为空)
	 * @param cityId
	 *            收货人城市编号(不可为空)
	 * @param areaId
	 *            收货人所在 区县 编号(不可为空)
	 * @param areaDetail
	 *            收货人 街道地址(不可为空)
	 * @param zipCode
	 *            邮编
	 */
	public Address(String adsId, String name, String phone, String fixedTel, int provinceId, int cityId, int areaId, String areaDetail, String zipCode) {
		super();
		this.adsId = adsId;
		this.name = name;
		this.phone = phone;
		this.fixedTel = fixedTel;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.areaId = areaId;
		this.areaDetail = areaDetail;
		this.zipCode = zipCode;
	}

	public Address(int id, String name, String phone, String fixedTel, int provinceId, int cityId, int areaId, String areaDetail, String zipCode) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.fixedTel = fixedTel;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.areaId = areaId;
		this.areaDetail = areaDetail;
		this.zipCode = zipCode;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFixedTel() {
		return fixedTel;
	}

	public void setFixedTel(String fixedTel) {
		this.fixedTel = fixedTel;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public String getAreaDetail() {
		return areaDetail;
	}

	public void setAreaDetail(String areaDetail) {
		this.areaDetail = areaDetail;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAdsId() {
		return adsId;
	}

	public void setAdsId(String adsId) {
		this.adsId = adsId;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", name=" + name + ", phone=" + phone + ", fixedTel=" + fixedTel + ", provinceId=" + provinceId + ", cityId=" + cityId + ", areaId=" + areaId + ", areaDetail="
				+ areaDetail + ", zipCode=" + zipCode + "]";
	}
}
