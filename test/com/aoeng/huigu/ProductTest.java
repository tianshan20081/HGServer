/**
 * 
 */
package com.aoeng.huigu;

import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aoeng.huigu.model.LimitItem;
import com.aoeng.huigu.model.Product;
import com.aoeng.huigu.model.SimplePro;
import com.aoeng.huigu.model.Topic;
import com.aoeng.huigu.service.ProductService;
import com.aoeng.huigu.util.DataUtil;

/**
 * @author paynet Mar 17, 2014 2:08:56 PM
 * 
 */
public class ProductTest {
	private static ApplicationContext ac = null;
	private static ProductService ps = null;

	@BeforeClass
	public static void initAC() {
		ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
		ps = (ProductService) ac.getBean("productService");
		SystemContext.setOffSet("0");
		SystemContext.setPageSize("4");
	}

	@Test
	public void addPros() {
		Product p = null;
		for (int i = 1; i < 100; i++) {
			p = new Product();
			p.setName("Iphone" + i);
			p.setBuyLimit(i);
			p.setCommentCount(i * i);
			p.setInventoryArea("北京，上海");
			p.setLeftTime(i * 100);
			p.setLimitPrice(i * 35.00);
			p.setAvailable(i % 2 == 0 ? true : false);
			p.setMarketPrice(i * 35.00 + 15.00);
			p.setPrice(i * 35.00 + 10);
			p.setSales(i * i);
			p.setLimitBuy(i%7==0?true:false);
			p.setBrand(i%9==0?true:false);
			p.setAvailable(i%3==0?true:false);
			p.setTopic(i%23==0?true:false);
			p.setPubDate(new Date());
			p.setScore(DataUtil.format(Math.random()));
			String local = "http://192.168.4.4:8080/hg/images/";
			p.setPic(new String[] { local+"img0" + (i%3 + 1)  + ".png", local+"img0" +( i %3)+ ".png" });
			p.setBigPic(new String[] {  local+"img0" + (i%5 + 1 )+ ".png",  local+"img0" + ( i %2) + ".png" });
			ps.saveEntity(p);
		}

	}

	@Test
	public void getHotSalePros() {
		List<SimplePro> pros = ps.getHotSalePros();
		for (SimplePro product : pros) {
			System.out.println(product.toString());
		}
	}

	@Test
	public void getNewPros() {
		List<SimplePro> pros = ps.getNewPros();
		for (SimplePro p : pros) {
			System.out.println(p);
		}
	}

	@Test
	public void topic() {
		List<Topic> ts = ps.getTopicPros();
		
		for (Topic topic : ts) {
			System.out.println(topic.toString());
		}

	}
	@Test
	public void brand() {
		List<Topic> ts = ps.getBrandPros();
		
		for (Topic topic : ts) {
			System.out.println(topic.toString());
		}

	}
	@Test
	public void limitBuy() {
		List<LimitItem> ts = ps.getLimitBuyPros();
		
		for (LimitItem p : ts) {
			System.out.println(p.toString());
		}
	}
	@Test
	public void modifyAddr(){
		String hql = "from Product ";
		List<Product> list = ps.findEntityByHql(hql);
		for (Product p : list) {
			p.setPic(new String[]{p.getPic()[0].replace("http://192.168.4.4:8080/hg/", ""),
					p.getPic()[1].replace("http://192.168.4.4:8080/hg/", "")});
			p.setBigPic(new String[]{p.getBigPic()[0].replace("http://192.168.4.4:8080/hg/", ""),
					p.getBigPic()[1].replace("http://192.168.4.4:8080/hg/", "")});
			ps.saveOrUpdateEntity(p);
		}
	}

}
