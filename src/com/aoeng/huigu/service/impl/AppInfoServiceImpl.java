/**
 * 
 */
package com.aoeng.huigu.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aoeng.huigu.dao.AppInfoDao;
import com.aoeng.huigu.dao.BaseDao;
import com.aoeng.huigu.dao.impl.AppInfoDaoImpl;
import com.aoeng.huigu.model.AppInfo;
import com.aoeng.huigu.service.AppInfoService;

/**
 * @author paynet Mar 13, 2014 4:43:28 PM
 * @param <T>
 * 
 */
@Service("appInfoService")
public class AppInfoServiceImpl extends BaseServiceImpl<AppInfo> implements AppInfoService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.impl.BaseServiceImpl#setDao(com.aoeng.huigu.dao.BaseDao)
	 */
	@Resource(name = "appInfoDao")
	private AppInfoDao appInfoDao;
	@Override
	public void setDao(BaseDao<AppInfo> dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

	/* (non-Javadoc)
	 * @see com.aoeng.huigu.service.AppInfoService#getCurrentAppInfo()
	 */
	@Override
	public AppInfo getLastAppInfo(String name,String type) {
		// TODO Auto-generated method stub
		return appInfoDao.getLastAppInfo(name,type);
	}

	/* (non-Javadoc)
	 * @see com.aoeng.huigu.service.AppInfoService#saveAppInfo(com.aoeng.huigu.model.AppInfo)
	 */
	@Override
	public void saveAppInfo(AppInfo appInfo) {
		// TODO Auto-generated method stub
		appInfo.setUpdateDate(new Date());
		appInfoDao.saveEntity(appInfo);
	}

}
