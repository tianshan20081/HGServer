/**
 * 
 */
package com.aoeng.huigu;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aoeng.huigu.model.Address;
import com.aoeng.huigu.service.AddressService;

/**
 * @author paynet  Mar 19, 2014 12:37:08 PM
 * 
 */
public class AddressTest {
	
	private static ApplicationContext ac = null ;
	private static  AddressService as = null ;

	@BeforeClass
	public static void intAC(){
		ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
		as = (AddressService) ac.getBean("addressService");
	}
	@Test
	public void addAddress(){
		Address a = new Address();
		a.setName("张三");
		a.setPhone("1234455");
		a.setFixedTel("010-9897655688");
		a.setProvinceId(0);
		a.setCityId(12);
		a.setAreaId(123);
		a.setAreaDetail("闵贤庄");
		a.setZipCode("12345");
		
		as.saveEntity(a);
	}
	@Test
	public void getAllAddress(){
		List<Address> ass = as.getAllAddress();
		for (Address address : ass) {
			System.out.println(address.toString());
		}
	}
	@Test
	public void del(){
		Address a = as.findEntity(4);
		if (null != a) {
			System.out.println(a.toString());
			as.delEntity(a);
		}
	}
}
