package com.aoeng.huigu;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aoeng.huigu.model.AppInfo;
import com.aoeng.huigu.service.AppInfoService;

public class AppInfoTest {
	private static ApplicationContext ac;

	@BeforeClass
	public static void initAC() {
		ac = new ClassPathXmlApplicationContext("classpath:beans.xml");

	}

	@Test
	public void saveAppInfo() {

		// System.out.println(ac.getBean("appInfoService").toString());
		AppInfoService appInfoService = (AppInfoService) ac.getBean("appInfoService");
		AppInfo appInfo = new AppInfo();
		appInfo.setAppName("huigu");
		appInfo.setAppDesc("sssss");
		appInfo.setName("惠顾");
		appInfo.setType("Android");
		appInfo.setVersionName("1.0.0");
		appInfo.setVersionCode(1);
		appInfo.setFaceUpdate(true);
		appInfo.setDesc("BUG");
		appInfo.setUrl("http://192.168.4.4:8080/hg/HuiGu.apk");
		appInfoService.saveAppInfo(appInfo);

	}

	@Test
	public void findAppInfo() {

		// System.out.println(ac.getBean("appInfoService").toString());
		AppInfoService as = (AppInfoService) ac.getBean("appInfoService");
		System.out.println(as.getLastAppInfo("huigu","Android"));

	}

}
