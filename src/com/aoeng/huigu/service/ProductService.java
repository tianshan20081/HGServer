/**
 * 
 */
package com.aoeng.huigu.service;

import java.util.List;

import com.aoeng.huigu.model.CycleImg;
import com.aoeng.huigu.model.LimitItem;
import com.aoeng.huigu.model.Product;
import com.aoeng.huigu.model.SearchItem;
import com.aoeng.huigu.model.SimplePro;
import com.aoeng.huigu.model.Topic;

/**
 * @author paynet Mar 17, 2014 4:08:19 PM
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
	List<CycleImg> getCyclePros();

	/**
	 * @param hql
	 * @param strings
	 * @return
	 */
	List<SearchItem> search(String hql, String[] strings);

	/**
	 * 獲得促銷快報 中的產品列表
	 * 
	 * @return
	 */
	List<Topic> getTopicPros();

	/**
	 * @return
	 */
	List<Topic> getBrandPros();

	/**
	 * @return
	 */
	List<LimitItem> getLimitBuyPros();

	/**
	 * @return
	 */
	List<SearchItem> getNewlyPros();

}
