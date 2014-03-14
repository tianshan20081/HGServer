/**
 * 
 */
package com.aoeng.huigu.service;

import java.util.List;

/**
 * @author paynet  Mar 13, 2014 4:32:06 PM
 *
 */
public interface BaseService<T> {
	void saveEntity(T t);

	void updateEntity(T t);

	void delEntity(T t);

	void saveOrUpdateEntity(T t);

	T findEntity(Integer id);

	T loadEntity(Integer id);

	List<T> findEntityByHql(String hql, Object... objs);

	// hql 批处理实体
	void batchEntityByHql(String hql, Object... objs);
}
