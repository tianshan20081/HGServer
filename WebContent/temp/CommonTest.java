/**
 * 
 */
package com.aoeng.huigu;

import org.apache.struts2.ServletActionContext;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author paynet  Mar 24, 2014 4:42:47 PM
 * 
 */
public class CommonTest {
	private static ApplicationContext ac = null ;
	@BeforeClass
	public static void initAC(){
		ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
	}
	@Test
	public void addr(){
		
	}
	
	

}
