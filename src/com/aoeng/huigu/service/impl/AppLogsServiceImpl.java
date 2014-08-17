package com.aoeng.huigu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aoeng.huigu.dao.BaseDao;
import com.aoeng.huigu.model.AppLogsInfo;
import com.aoeng.huigu.service.AppLogsService;

@Service("appLogsService")
public class AppLogsServiceImpl extends BaseServiceImpl<AppLogsInfo> implements AppLogsService {

	@Resource(name = "appLogsDao")
	@Override
	public void setDao(BaseDao<AppLogsInfo> dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

}
