/**
 * 
 */
package com.aoeng.huigu.service;

import java.util.List;

import com.aoeng.huigu.model.OrderDetail;
import com.aoeng.huigu.model.OrderSummary;


/**
 * @author paynet  Apr 2, 2014 6:14:07 PM
 * 
 */
public interface OrderDetailService extends BaseService<OrderDetail> {

	/**
	 * @param userId
	 * @return
	 */
	List<OrderSummary> findOrdersByUid(int userId);

}
