package com.aoeng.huigu.dao.impl;

import org.springframework.stereotype.Repository;

import com.aoeng.huigu.dao.BaseDao;
import com.aoeng.huigu.model.AppLogsInfo;

@Repository("appLogsDao")
public class AppLogsDaoImpl extends BaseDaoImpl<AppLogsInfo> implements BaseDao<AppLogsInfo> {

}
