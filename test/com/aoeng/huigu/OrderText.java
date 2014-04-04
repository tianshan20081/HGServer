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

import com.aoeng.huigu.model.Address;
import com.aoeng.huigu.model.OrderDetail;
import com.aoeng.huigu.model.OrderSummary;
import com.aoeng.huigu.model.ProVO;
import com.aoeng.huigu.service.AddressService;
import com.aoeng.huigu.service.OrderDetailService;
import com.aoeng.huigu.service.ProVoService;
import com.aoeng.huigu.util.KeyUtils;

/**
 * @author paynet Apr 2, 2014 6:19:48 PM
 * 
 */
public class OrderText {

	private static ApplicationContext ac = null;
	private static OrderDetailService os;
	private static ProVoService ps = null;
	private static AddressService as = null;

	@BeforeClass
	public static void initAC() {
		ac = new ClassPathXmlApplicationContext("beans.xml");
		os = (OrderDetailService) ac.getBean("orderDetailService");
		ps = (ProVoService) ac.getBean("proVoService");

		as = (AddressService) ac.getBean("addressService");
	}

	@Test
	public void list() {

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
	public void getOrderByOid() {
		OrderDetail od = os.getOrderByOid("20140403173944558");

		if (null != od) {
			System.out.println(od.toString());
		}
	}

	@Test
	public void getProVoById() {

		ProVO po = ps.findEntity(3);
//		OrderDetail od = po.getOrderDetail();
//		System.out.println(od.toString());

	}

	@Test
	public void createOrder() {
		Address ads = as.findEntity(1);
		ProVO vo1 = new ProVO(100, 2);
		ProVO vo2 = new ProVO(150, 5);
		ProVO vo3 = new ProVO(122, 1);

		OrderDetail od = new OrderDetail();
		od.setOid(KeyUtils.createOid());
		od.setAmount(1234.00);
		od.setStatus("已付款");
		od.setCreateTime(new Date());
		od.setAllAmount(1444.00);
		od.setDiscount(234.33);
		od.setFreight(23.04);
		od.setPayMethod("银联支付");
		od.setTransport("中通");
		od.setTransportId("452456633");
		od.getPros().add(vo1);
		od.getPros().add(vo2);
		od.getPros().add(vo3);
		od.setAdsId("14526e255321112");
		System.out.println(ads.toString());
		ps.saveEntity(vo1);
		ps.saveEntity(vo2);
		ps.saveEntity(vo3);
		os.saveEntity(od);

	}

}
