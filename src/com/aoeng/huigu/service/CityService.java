/**
 * 
 */
package com.aoeng.huigu.service;

import java.util.List;

import com.aoeng.huigu.model.City;

/**
 * @author paynet  Apr 1, 2014 4:24:49 PM
 * 
 */
public interface CityService extends BaseService<City> {


	/**
	 * @param i
	 * @return
	 */
	List<City> getAreasByPid(int areaPid);

	/**
	 * @param i
	 * @return
	 */
	City findEntityByAreaId(int i);
}

