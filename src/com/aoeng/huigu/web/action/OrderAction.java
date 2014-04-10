/**
 * 
 */
package com.aoeng.huigu.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.aoeng.huigu.model.OrderDetail;
import com.aoeng.huigu.model.OrderSummary;
import com.aoeng.huigu.service.OrderDetailService;
import com.aoeng.huigu.util.JsonUtils;

/**
 * @author paynet Apr 2, 2014 7:07:48 PM
 * 
 */
@Controller("orderAction")
public class OrderAction extends BaseAction<OrderDetail> {

	@Resource(name = "orderDetailService")
	private OrderDetailService os;

	private int userId;
	private String oid ;
	
	public void detail(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "1");
		OrderDetail od = os.getOrderByOid("20140403173944558");
		map.put("orderDetail", od);
		JsonUtils.toJson(map);
	}

	public void list() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "1");
		List<OrderSummary> list = os.findOrdersByUid(userId);

		map.put("orderList", list);
		map.put("size", list.size());
		JsonUtils.toJson(map);

	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}
	

}
