/**
 * 
 */
package com.aoeng.huigu.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aoeng.huigu.dao.BaseDao;
import com.aoeng.huigu.model.OrderDetail;
import com.aoeng.huigu.model.OrderSummary;
import com.aoeng.huigu.model.ProVO;
import com.aoeng.huigu.service.OrderDetailService;
import com.aoeng.huigu.service.ProductService;

/**
 * @author paynet Apr 2, 2014 6:15:30 PM
 * 
 */
@Service("orderDetailService")
public class OrderDetailServiceImpl extends BaseServiceImpl<OrderDetail> implements OrderDetailService {

	@Resource(name = "productService")
	private ProductService ps;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.impl.BaseServiceImpl#setDao(com.aoeng.huigu.dao.BaseDao)
	 */
	@Resource(name = "orderDetailDao")
	@Override
	public void setDao(BaseDao<OrderDetail> dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.OrderDetailService#findOrdersByUid(int)
	 */
	@Override
	public List<OrderSummary> findOrdersByUid(int userId) {
		// TODO Auto-generated method stub
		List<OrderSummary> list = new ArrayList<OrderSummary>();
		String hql = "from OrderDetail o ";
		List<OrderDetail> ods = this.dao.findEntityByHql(hql);
		for (OrderDetail o : ods) {
			list.add(new OrderSummary(o.getId(), o.getAmount(), "images/img04.png", o.getOrderTime(), o.getOrderStatus()));
		}
		return list;
	}
}
