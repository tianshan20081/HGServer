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
	}

	@Test
	public void addPros() {

		Product p = null;
		for (int i = 1; i < 20; i++) {
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
			p.setLimitBuy(true);
			p.setPubDate(new Date());
			p.setScore(DataUtil.format(Math.random()));
			p.setPic(new String[] { "localhost:8080/hg/im0" + i + 1 + ".png", "localhost:8080/hg/im0" + i + ".png" });
			p.setBigPic(new String[] { "localhost:8080/hg/bigIm0" + i + 1 + ".png", "localhost:8080/hg/bigIm0" + i + ".png" });
			ps.saveEntity(p);
		}

	}

	@Test
	public void getHotSalePros() {
		SystemContext.setOffSet(0);
		SystemContext.setPageSize(5);
		List<SimplePro> pros = ps.getHotSalePros();
		for (SimplePro product : pros) {
			System.out.println(product.toString());
		}
	}

	@Test
	public void getNewPros() {
		SystemContext.setOffSet(0);
		SystemContext.setPageSize(3);
		List<SimplePro> pros = ps.getNewPros();
		for (SimplePro p : pros) {
			System.out.println(p);
		}
	}

	@Test
	public void topic() {
		SystemContext.setOffSet(0);
		SystemContext.setPageSize(3);
		List<Topic> ts = ps.getTopicPros();
		
		for (Topic topic : ts) {
			System.out.println(topic.toString());
		}

	}
	@Test
	public void brand() {
		SystemContext.setOffSet(0);
		SystemContext.setPageSize(3);
		List<Topic> ts = ps.getBrandPros();
		
		for (Topic topic : ts) {
			System.out.println(topic.toString());
		}

	}
	@Test
	public void limitBuy() {
		SystemContext.setOffSet(0);
		SystemContext.setPageSize(3);
		List<LimitItem> ts = ps.getLimitBuyPros();
		
		for (LimitItem p : ts) {
			System.out.println(p.toString());
		}

	}

}
