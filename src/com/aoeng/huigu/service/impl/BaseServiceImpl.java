package com.aoeng.huigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.aoeng.huigu.dao.BaseDao;
import com.aoeng.huigu.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {
	private BaseDao<T> dao;
	@Resource
	public void setDao(BaseDao<T> dao) {
		this.dao = dao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.BaseService#saveEntity(java.lang.Object)
	 */
	@Override
	public void saveEntity(T t) {
		// TODO Auto-generated method stub
		System.out.println("save");
		dao.saveEntity(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.BaseService#updateEntity(java.lang.Object)
	 */
	@Override
	public void updateEntity(T t) {
		// TODO Auto-generated method stub
		dao.updateEntity(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.BaseService#delEntity(java.lang.Object)
	 */
	@Override
	public void delEntity(T t) {
		// TODO Auto-generated method stub
		dao.delEntity(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.BaseService#saveOrUpdateEntity(java.lang.Object)
	 */
	@Override
	public void saveOrUpdateEntity(T t) {
		// TODO Auto-generated method stub
		dao.saveOrUpdateEntity(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.BaseService#findEntity(java.lang.Integer)
	 */
	@Override
	public T findEntity(Integer id) {
		// TODO Auto-generated method stub
		return dao.findEntity(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.BaseService#loadEntity(java.lang.Integer)
	 */
	@Override
	public T loadEntity(Integer id) {
		// TODO Auto-generated method stub
		return dao.loadEntity(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.BaseService#findEntityByHql(java.lang.String, java.lang.Object[])
	 */
	@Override
	public List<T> findEntityByHql(String hql, Object... objs) {
		// TODO Auto-generated method stub
		return dao.findEntityByHql(hql, objs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.BaseService#batchEntityByHql(java.lang.String, java.lang.Object[])
	 */
	@Override
	public void batchEntityByHql(String hql, Object... objs) {
		// TODO Auto-generated method stub
		dao.batchEntityByHql(hql, objs);
	}

}
