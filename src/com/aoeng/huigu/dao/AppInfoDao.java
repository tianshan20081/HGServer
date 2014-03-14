/**
 * 
 */
package com.aoeng.huigu.dao;

import com.aoeng.huigu.model.AppInfo;

/**
 * @author paynet  Mar 14, 2014 1:51:39 PM
 * 
 */
public interface AppInfoDao extends BaseDao<AppInfo> {

	/**
	 * @param type 
	 * @param name 
	 * @return
	 */
	AppInfo getLastAppInfo(String appName, String type);


}
