/**
 * 
 */
package com.aoeng.huigu.service;

import java.util.List;

import com.aoeng.huigu.model.Product;
import com.aoeng.huigu.model.SearchItem;
import com.aoeng.huigu.model.SimplePro;

/**
 * @author paynet  Mar 17, 2014 4:08:19 PM
 * 
 */
public interface ProductService extends BaseService<Product> {

	/**
	 * @return
	 */
	List<SimplePro> getNewPros();

	/**
	 * @return
	 */
	List<SimplePro> getHotSalePros();

	/**
	 * @return
	 */
	List<SimplePro> getCyclePros();

	/**
	 * @param hql
	 * @param strings
	 * @return
	 */
	List<SearchItem> search(String hql, String[] strings);

}
