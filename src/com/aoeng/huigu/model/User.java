/**
 * 
 */
package com.aoeng.huigu.model;

import java.util.Date;

/**
 * @author paynet Mar 13, 2014 6:16:24 PM 用户账户信息
 */
public class User {
	private Integer id;
	/** 会员ID */
	private Integer uid;
	/**
	 * 登录名
	 */
	private String userName;
	/**
	 * 登录密码
	 */
	private String passWord;
	/**
	 * 用户昵称
	 */
	private String nickName;
	/**
	 * 用户注册日期
	 */
	private Date regDate;
	/**
	 * 用户注册IP
	 */
	private String regIp;
	/**
	 * 用户注册邮箱
	 */
	private String email;
	/**
	 * 用户注册手机号码
	 */
	private String mobile;

	public User() {
		super();
	}

	public User(Integer id, Integer uid, String userName, String passWord, String nickName, Date regDate, String regIp, String email, String mobile) {
		super();
		this.id = id;
		this.uid = uid;
		this.userName = userName;
		this.passWord = passWord;
		this.nickName = nickName;
		this.regDate = regDate;
		this.regIp = regIp;
		this.email = email;
		this.mobile = mobile;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRegIp() {
		return regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", uid=" + uid + ", userName=" + userName + ", passWord=" + passWord + ", nickName=" + nickName + ", regDate=" + regDate + ", regIp=" + regIp + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}

}
