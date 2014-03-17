/**
 * 
 */
package com.aoeng.huigu;


import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.aoeng.huigu.model.AppInfo;
import com.sdicons.json.mapper.JSONMapper;

/**
 * @author paynet  Mar 14, 2014 6:08:18 PM
 * 
 */
public class JsonUtil {

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
		String jsonStr = new JSONMapper().toJSON(map).render(false).toString();
		
		System.out.println(jsonStr);
		
		
	}
}
