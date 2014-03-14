/**
 * 
 */
package com.aoeng.huigu.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.aoeng.huigu.dao.AppInfoDao;
import com.aoeng.huigu.model.AppInfo;

/**
 * @author paynet Mar 13, 2014 5:26:40 PM
 * 
 */
@Repository("appInfoDao")
public class AppInfoDaoImpl extends BaseDaoImpl<AppInfo> implements AppInfoDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.dao.AppInfoDao#getLastAppInfo(java.lang.String)
	 */
	@Override
	public AppInfo getLastAppInfo(String appName, String appType) {
		// TODO Auto-generated method stub
		String hql = "select r from com.aoeng.huigu.model.AppInfo r where r.appName=? and r.type=? and r.id in ( select max(id) from com.aoeng.huigu.model.AppInfo)";
		Query query = sf.getCurrentSession().createQuery(hql);
		query.setParameter(0, appName);
		query.setParameter(1, appType);
		if (0 != query.list().size()) {
			return (AppInfo) (query.list()).get(0);
		}
		return null;
	}

}
