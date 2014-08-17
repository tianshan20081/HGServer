package com.aoeng.huigu.model;

import java.io.Serializable;
import java.util.Date;

public class AppLogsInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6151427287511413112L;
	private int id;
	private AppInfo appInfo;
	private String deviceInfo;
	private Date uploadDate;
	private Date exceptionDate;
	private String exceptionInfo;

	public AppLogsInfo() {
		super();
	}

	public AppLogsInfo(int id, AppInfo appInfo, String deviceInfo, Date uploadDate, Date exceptionDate, String exceptionInfo) {
		super();
		this.id = id;
		this.appInfo = appInfo;
		this.deviceInfo = deviceInfo;
		this.uploadDate = uploadDate;
		this.exceptionDate = exceptionDate;
		this.exceptionInfo = exceptionInfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AppInfo getAppInfo() {
		return appInfo;
	}

	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Date getExceptionDate() {
		return exceptionDate;
	}

	public void setExceptionDate(Date exceptionDate) {
		this.exceptionDate = exceptionDate;
	}

	public String getExceptionInfo() {
		return exceptionInfo;
	}

	public void setExceptionInfo(String exceptionInfo) {
		this.exceptionInfo = exceptionInfo;
	}

	@Override
	public String toString() {
		return "AppLogsInfo [id=" + id + ", appInfo=" + appInfo + ", deviceInfo=" + deviceInfo + ", uploadDate=" + uploadDate + ", exceptionDate=" + exceptionDate + ", exceptionInfo=" + exceptionInfo
				+ "]";
	}

}
