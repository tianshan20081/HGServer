/**
 * 
 */
package com.aoeng.huigu;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aoeng.huigu.model.CycleImg;
import com.aoeng.huigu.service.ProductService;

/**
 * @author paynet  Mar 24, 2014 3:35:59 PM
 * 
 */
public class HomeTest {
	private static ApplicationContext ac = null;
	private static ProductService ps = null ;
	
	@BeforeClass
	public static void intAC(){
		ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
		ps = (ProductService) ac.getBean("productService");
	}
	
	@Test
	public void cycle(){
		SystemContext.setOffSet(0);
		SystemContext.setPageSize(3);
		List<CycleImg> cycleImgs = ps.getCyclePros();
		for (CycleImg c : cycleImgs) {
			System.out.println(c.toString());
		}
	}
	
	

}
