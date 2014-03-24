/**
 * 
 */
package com.aoeng.huigu.web.action;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.Servlet;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.aoeng.huigu.model.AppInfo;
import com.aoeng.huigu.service.AppInfoService;
import com.aoeng.huigu.util.JsonUtils;
import com.aoeng.huigu.util.ValidateUtil;

/**
 * @author paynet Mar 14, 2014 1:45:38 PM
 * 
 */
@Controller("appAction")
public class AppAction extends BaseAction<AppInfo> {

	@Resource(name = "appInfoService")
	private AppInfoService infoService;

	public void version() {
		AppInfo appInfo = infoService.getLastAppInfo("huigu","android");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("response", "AppInfo");
		map.put("AppInfo", appInfo);
		JsonUtils.toJson(map);
	}
	public void info() {
		StringBuffer reurl = ServletActionContext.getRequest().getRequestURL();
			System.out.println(reurl);
			System.out.println(ServletActionContext.getRequest().getRemoteAddr());
			System.out.println(ServletActionContext.getRequest().getRemoteHost());
		
		if (null == model) {
			ret("App 详细信息请求參數不能爲空 !");
			return;
		}
		if (!ValidateUtil.isValid(model.getName())) {
			ret("App name 不能为空!");
			return;
		}
		if (!ValidateUtil.isValid(model.getType())) {
			ret("App type 不能为空 ！");
			return;
		}
		System.out.println(model.toString());
		AppInfo appInfo = infoService.getLastAppInfo(model.getName(), model.getType());
		if (null == appInfo) {
			ret("App 查詢 App 詳情失敗 !");
			return;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("response", "AppInfo");
		map.put("AppInfo", appInfo);
		JsonUtils.toJson(map);
	}

}
