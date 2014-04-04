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
import com.aoeng.huigu.model.City;
import com.aoeng.huigu.service.AddressService;
import com.aoeng.huigu.service.CityService;
import com.aoeng.huigu.util.CreateID;

/**
 * @author paynet Mar 19, 2014 12:37:08 PM
 * 
 */
public class AddressTest {

	private static ApplicationContext ac = null;
	private static AddressService as = null;
	private static CityService cs = null;

	@BeforeClass
	public static void intAC() {
		ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
		as = (AddressService) ac.getBean("addressService");
		cs = (CityService) ac.getBean("cityService");
	}

	@Test
	public void addAddress() {
		Address a = new Address();
		List<City> ps = cs.getAreasByPid(0);
		City prov = ps.get(22);
		System.out.println(prov.toString());
		a.setProvinceId(prov.getAreaid());
		City city = cs.getAreasByPid(prov.getAreaid()).get(3);
		System.out.println(city.toString());
		a.setCityId(city.getAreaid());
		City area = cs.getAreasByPid(city.getAreaid()).get(5);
		System.out.println(area.toString());
		a.setAreaId(area.getAreaid());
		a.setName("奴二");
		a.setPhone("1234455");
		a.setFixedTel("010-9897655688");
		a.setAreaDetail("北京西路 620 ");
		a.setZipCode("12345");
		String adsId = CreateID.generate();
		System.out.println(adsId);
		a.setAdsId(adsId);

		as.saveEntity(a);
	}

	@Test
	public void getAllAddress() {
		List<Address> ass = as.getAllAddress();
		for (Address address : ass) {
			System.out.println(address.toString());
		}
	}

	@Test
	public void getAddressById() {
		Address ads = as.findEntity(1);
		if (null != ads) {
			System.out.println(ads.toString());
		}
	}

	@Test
	public void getAddressByAdsId() {
		Address ads = as.getAddressByAdsId("14526e255321112");
		if (null != ads) {
			System.out.println(ads.toString());
		}
	}

	@Test
	public void del() {
		Address a = as.findEntity(4);
		if (null != a) {
			System.out.println(a.toString());
			as.delEntity(a);
		}
	}
}
