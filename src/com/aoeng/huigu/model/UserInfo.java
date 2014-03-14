/**
 * 
 */
package com.aoeng.huigu.model;

/**
 * @author paynet Mar 13, 2014 6:29:37 PM 用户购买信息
 */
public class UserInfo {
	private Integer id;
	/** 会员ID */
	private Integer uid;
	/** 会员积分 */
	private int bonus;

	/** 会员等级 */
	private String level;

	/** session MD5 */
	private String usersession;

	/** 所下订单数 */
	private int ordercount;

	/** 收藏总数 */
	private int favoritescount;

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

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getUsersession() {
		return usersession;
	}

	public void setUsersession(String usersession) {
		this.usersession = usersession;
	}

	public int getOrdercount() {
		return ordercount;
	}

	public void setOrdercount(int ordercount) {
		this.ordercount = ordercount;
	}

	public int getFavoritescount() {
		return favoritescount;
	}

	public void setFavoritescount(int favoritescount) {
		this.favoritescount = favoritescount;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", uid=" + uid + ", bonus=" + bonus + ", level=" + level + ", usersession=" + usersession + ", ordercount=" + ordercount + ", favoritescount=" + favoritescount
				+ "]";
	}
	
}
