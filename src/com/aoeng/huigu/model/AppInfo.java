package com.aoeng.huigu.model;

import java.util.Date;

/**
 * 
 * @author paynet 客户端信息
 */
public class AppInfo {
	/** App ID */
	private Integer id;
	/*App 名称*/
	private String appName ;
	/*App 类型 分为 Android IOS */
	private String type ;
	/* app 描述 */
	private String appDesc;
	/** App 中文名称 */
	private String name;
	/** 版本号 */
	private String versionName;
	/** 版本ID */
	private Integer versionCode;
	/** 更新时间 */
	private Date updateDate;
	/** 更新描述 */
	private String desc;
	/** 是否強制更新 */
	private boolean faceUpdate;
	/** 下载地址 */
	private String url;

	public AppInfo(Integer id, String appName, String type, String appDesc, String name, String versionName, Integer versionCode, Date updateDate, String desc, boolean faceUpdate, String url) {
		super();
		this.id = id;
		this.appName = appName;
		this.type = type;
		this.appDesc = appDesc;
		this.name = name;
		this.versionName = versionName;
		this.versionCode = versionCode;
		this.updateDate = updateDate;
		this.desc = desc;
		this.faceUpdate = faceUpdate;
		this.url = url;
	}

	public AppInfo() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAppDesc() {
		return appDesc;
	}

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public Integer getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isFaceUpdate() {
		return faceUpdate;
	}

	public void setFaceUpdate(boolean faceUpdate) {
		this.faceUpdate = faceUpdate;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "AppInfo [id=" + id + ", appName=" + appName + ", type=" + type + ", appDesc=" + appDesc + ", name=" + name + ", versionName=" + versionName + ", versionCode=" + versionCode
				+ ", updateDate=" + updateDate + ", desc=" + desc + ", faceUpdate=" + faceUpdate + ", url=" + url + "]";
	}


}
