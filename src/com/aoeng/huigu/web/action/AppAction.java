/**
 * 
 */
package com.aoeng.huigu.web.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.aoeng.huigu.model.AppInfo;
import com.aoeng.huigu.service.AppInfoService;
import com.aoeng.huigu.util.ValidateUtil;

/**
 * @author paynet  Mar 14, 2014 1:45:38 PM
 * 
 */
@Controller("appAction")
public class AppAction extends BaseAction<AppInfo> {

	@Resource(name="appInfoService")
	private AppInfoService infoService ;
	public void info(){
		if (null == model) {
			ret("App 详细信息请求參數不能爲空 !");
			return ;
		}
		if (!ValidateUtil.isValid(model.getName())) {
			ret("App name 不能为空!");
			return ;
		}
		if (!ValidateUtil.isValid(model.getType())) {
			ret("App type 不能为空 ！");
			return ;
		}
		System.out.println(model.toString());
		AppInfo appInfo =infoService.getLastAppInfo(model.getName(),model.getType());
		if (null == appInfo) {
			ret("App 查詢 App 詳情失敗 !");
			return ;
		}
		ret(appInfo.toString());
		
	}
	

}
