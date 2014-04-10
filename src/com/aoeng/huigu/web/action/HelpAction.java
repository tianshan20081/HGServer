/**
 * 
 */
package com.aoeng.huigu.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;

import com.aoeng.huigu.model.Help;
import com.aoeng.huigu.service.HelpService;
import com.aoeng.huigu.util.JsonUtils;

/**
 * @author paynet Mar 19, 2014 10:16:42 AM
 * 
 */
@Controller("helpAction")
public class HelpAction extends BaseAction<Help> {
	/* 版本号 */
	private String versionNum;
	/* 帮助信息父亲ID */
	private int pid;
	@Resource(name = "helpService")
	private HelpService helpService;
	/**
	 * 获得所有帮助信息标题
	 */
	public void info() {
		Map<String, Object> map = new HashMap<String, Object>();
		if (StringUtils.isEmpty(versionNum)) {
			System.out.println(versionNum);
			map.put("result", "1");
			map.put("status", "error");
			map.put("statusDesc", "版本号不能为空 !");
			JsonUtils.toJson(map);
			return ;
		}
		
		List<Help> helps = helpService.getAllHelpTitle(versionNum);
		map.put("result", "1");
		map.put("helpList", helps);
		map.put("helpSize", helps.size());

		JsonUtils.toJson(map);
	}
	public void detail(){
		Help help = helpService.findEntity(pid);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("result", "1");
		map.put("helpDetail", help);
		JsonUtils.toJson(map);
	}
	public void setVersionNum(String versionNum) {
		this.versionNum = versionNum;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
}
