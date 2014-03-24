/**
 * 
 */
package com.aoeng.huigu.util;

import java.io.IOException;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSONObject;

/**
 * @author paynet Mar 14, 2014 5:57:51 PM
 * 
 */
public class JsonUtils {

	public static void toJson(Map map) {

		try {
			String jsonStr = new JSONObject(map).toJSONString();
			ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
			ServletActionContext.getResponse().getWriter().print(jsonStr);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			try {
				ServletActionContext.getResponse().getWriter().print("");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
