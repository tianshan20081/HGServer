/**
 * 
 */
package com.aoeng.huigu;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aoeng.huigu.model.Help;
import com.aoeng.huigu.service.HelpService;

/**
 * @author paynet  Mar 19, 2014 10:27:04 AM
 * 
 */
public class HelpText {
	
	private static ApplicationContext ac = null ;
	private static HelpService helpService = null ;
	
	@BeforeClass
	public static void initAC(){
		ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
		helpService = (HelpService) ac.getBean("helpService");
	}
	@Test
	public void addHelps(){
		Help help = null ;
		for (int i = 0; i < 10; i++) {
			help = new Help();
			help.setTitle("如何注册"+i);
			help.setContent("用户可以通过客户端或者网站首页进行注册"+i*i);
			help.setVersion("1.0");
			helpService.saveEntity(help);
		}
	}
	@Test
	public void getAllHelps(){
		List<Help> helps =  helpService.getAllHelps();
		for (Help help : helps) {
			System.out.println(help.toString());
		}
	}
	@Test
	public void getAllHelp(){
		List<Help> helps = helpService.getAllHelpTitle("1.0");
		for (Help help : helps) {
			System.out.println(help.toString());
		}
	}

}
