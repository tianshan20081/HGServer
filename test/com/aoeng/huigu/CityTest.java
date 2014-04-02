/**
 * 
 */
package com.aoeng.huigu;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aoeng.huigu.model.City;
import com.aoeng.huigu.service.CityService;

/**
 * @author paynet Apr 1, 2014 5:16:11 PM
 * 
 */
public class CityTest {

	private static ApplicationContext ac = null;
	private static CityService cs = null;

	@BeforeClass
	public static void initAC() {
		ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
		cs = (CityService) ac.getBean("cityService");
	}

	@Test
	public void getAreasByPid() {
		List<City> list = cs.getAreasByPid(110100);
		for (City c : list) {
			System.out.println(c.toString());
		}
	}

	@Test
	public void getAreaByAreaId() {
		City c = cs.findEntityByAreaId(371300);
		System.out.println(c.toString());
	}

}
