/**
 * 
 */
package com.aoeng.huigu.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.sdicons.json.mapper.JSONMapper;
import com.sdicons.json.mapper.MapperException;

/**
 * @author paynet Mar 14, 2014 5:57:51 PM
 * 
 */
public class JsonUtils {

	public static void toJson(Map map) {

		try {
			String jsonStr = new JSONMapper().toJSON(map).render(false).toString();
			ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
			ServletActionContext.getResponse().getWriter().print(jsonStr);
		} catch (MapperException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ServletActionContext.getResponse().getWriter().print("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
