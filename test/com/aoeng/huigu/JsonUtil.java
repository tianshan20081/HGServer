/**
 * 
 */
package com.aoeng.huigu;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.net.www.URLConnection;
import sun.net.www.http.HttpClient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.aoeng.huigu.model.AppInfo;
import com.aoeng.huigu.model.Arr;
import com.aoeng.huigu.model.Topic;
import com.aoeng.huigu.service.ProductService;


/**
 * @author paynet  Mar 14, 2014 6:08:18 PM
 * 
 */
public class JsonUtil {
	private static ApplicationContext ac = null ;
	private static ProductService ps = null ;
	@BeforeClass
	public static void initAC(){
		ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
		ps = (ProductService) ac.getBean("productService");
		SystemContext.setOffSet("0");
		SystemContext.setPageSize("4");
		
	}

	@Test
	public void toJson() throws Exception{
		
		AppInfo info = new AppInfo();
		info.setAppDesc("sssss");
		AppInfo info2 = new AppInfo();
		info2.setAppDesc("22222");
		AppInfo info3 = new AppInfo();
		info3.setAppDesc("3333");
		AppInfo[] content = new AppInfo[]{info,info2,info3};
		Map<String, Object>  map = new HashMap<String, Object>();
		map.put("status", 1);
		map.put("statusDesc", "desc");
		map.put("content", content);
//		String jsonStr = new JSONObject(map).toJSONString();
		
//		System.out.println(jsonStr);
	}
	@Test
	public void parserAliJson() throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("response", "topic");
		List<Topic> pros = ps.getTopicPros();
		map.put("proList", pros);
		map.put("prosSize", pros.size());
		String json = JSON.toJSONString(map).toString();
		System.out.println(json);
		org.json.JSONObject jo = new org.json.JSONObject(json);
		String rep = jo.getString("response");
		String pss = jo.getString("proList");
		System.out.println(pss);
		List<Topic> tps = JSON.parseArray(pss, Topic.class);
		
		for (Topic t : tps) {
			System.out.println(t.toString());
		}
		
	}
	
	@Test
	public void test() throws Exception{
		String url = "http://www.huigush.com/index.php/conventional/shuffling_figure/";
		URL url2 = new URL(url);
		java.net.URLConnection conn = url2.openConnection();
		InputStream in = conn.getInputStream();
		
		ByteArrayOutputStream bof = new ByteArrayOutputStream();
		int size = 0 ;
		byte[] BUFFER = new byte[1024];
		while ((size = in.read(BUFFER,0,1024))!=-1) {
			bof.write(BUFFER, 0, size);
		}
		String json = new String(bof.toByteArray());
		System.out.println(json);
		JSONObject jo = new JSONObject(json);
		String describe = jo.getString("describe");
		int result = jo.getInt("result");
		int imgNum = jo.getInt("img_num");
		System.out.println(describe +result+imgNum);
		String ar = jo.getString("arr");
		List<Arr> arrs = JSON.parseArray(ar, Arr.class);
		for (Arr object : arrs) {
			System.out.println(object.toString());
		}
		
	}
}
