/**
 * 
 */
package com.aoeng.huigu.service;

import org.springframework.stereotype.Service;

import com.aoeng.huigu.model.AppInfo;

/**
 * @author paynet  Mar 13, 2014 4:42:12 PM
 * 
 */
public interface AppInfoService extends BaseService<AppInfo> {


	/**
	 * @param string 
	 * @param name
	 * @return 
	 */
	AppInfo getLastAppInfo(String appName, String string);

	/**
	 * @param appInfo
	 */
	void saveAppInfo(AppInfo appInfo);
}
