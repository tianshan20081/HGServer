/**
 * 
 */
package com.aoeng.huigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aoeng.huigu.dao.BaseDao;
import com.aoeng.huigu.model.City;
import com.aoeng.huigu.service.CityService;

/**
 * @author paynet Apr 1, 2014 4:25:59 PM
 * 
 */
@Service("cityService")
public class CityServiceImpl extends BaseServiceImpl<City> implements CityService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.impl.BaseServiceImpl#setDao(com.aoeng.huigu.dao.BaseDao)
	 */
	@Resource(name = "cityDao")
	@Override
	public void setDao(BaseDao<City> dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

	/* (non-Javadoc)
	 * @see com.aoeng.huigu.service.CityService#getAreasByPid(int)
	 */
	@Override
	public List<City> getAreasByPid(int areaPid) {
		// TODO Auto-generated method stub
		String hql = " from City c where c.areapid = ? ";
		return this.dao.findEntityByHql(hql,new Object[]{areaPid});
	}

	/* (non-Javadoc)
	 * @see com.aoeng.huigu.service.CityService#findEntityByAreaId(int)
	 */
	@Override
	public City findEntityByAreaId(int areaId) {
		// TODO Auto-generated method stub
		String hql = " from City c where c.areapid = ? ";
		return this.dao.findEntityByHql(hql,new Object[]{areaId}).get(0);
	}


}
