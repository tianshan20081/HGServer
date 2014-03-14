/**
 * 
 */
package com.aoeng.huigu.util;

import java.util.HashMap;
import java.util.Map;

import com.sdicons.json.mapper.JSONMapper;
import com.sdicons.json.mapper.MapperException;


/**
 * @author paynet  Mar 14, 2014 5:57:51 PM
 * 
 */
public class JsonUtils {
	
	public static String toJson(Object obj){
		
		try {
			Map<String, Object>  map = new HashMap<String, Object>();
			map.put("status", 1);
			map.put("statusDesc", "desc");
			map.put("content", obj);
			String jsonStr = new JSONMapper().toJSON(map).render(false).toString();
		 return jsonStr;
		} catch (MapperException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	

}
