/**
 * 
 */
package com.aoeng.huigu;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aoeng.huigu.model.OrderDetail;
import com.aoeng.huigu.model.OrderSummary;
import com.aoeng.huigu.model.ProVO;
import com.aoeng.huigu.service.OrderDetailService;
import com.aoeng.huigu.service.ProVoService;

/**
 * @author paynet Apr 2, 2014 6:19:48 PM
 * 
 */
public class OrderText {

	private static ApplicationContext ac = null;
	private static OrderDetailService os;
	private static ProVoService ps = null;

	@BeforeClass
	public static void initAC() {
		ac = new ClassPathXmlApplicationContext("beans.xml");
		os = (OrderDetailService) ac.getBean("orderDetailService");
		ps = (ProVoService) ac.getBean("proVoService");

	}
	
	@Test
	public void list(){
		
		List<OrderSummary> list = os.findOrdersByUid(0);
		for (OrderSummary o : list) {
			System.out.println(o.toString());
			
		}
	}

	@Test
	public void getOrderById() {

		OrderDetail od = os.findEntity(3);
		Set<ProVO> vs = od.getPros();
		System.out.println(od.toString());
		for (ProVO v : vs) {
			System.out.println(v.toString());
		}
	}
	@Test
	public void getProVoById() {

		ProVO po = ps.findEntity(3);
		OrderDetail od = po.getOrderDetail();
		System.out.println(od.toString());
		
	}

	@Test
	public void addOrder() {
		ProVO vo = new ProVO();
		vo.setProId(2);
		vo.setNumber(3);
		OrderDetail od = new OrderDetail();
		od.setAmount(1234.00);
		od.setOrderStatus("已付款");
		od.setOrderTime(new Date());
		od.addProVo(vo);

		ps.saveEntity(vo);
		os.saveEntity(od);

	}

}
