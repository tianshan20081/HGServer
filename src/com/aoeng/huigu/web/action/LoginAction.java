/**
 * 
 */
package com.aoeng.huigu.web.action;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Controller;

import com.aoeng.huigu.model.User;
import com.aoeng.huigu.service.UserService;
import com.aoeng.huigu.util.DataUtil;
import com.aoeng.huigu.util.ValidateUtil;

/**
 * @author paynet Mar 13, 2014 6:38:01 PM
 * 
 */
@Controller("loginAction")
public class LoginAction extends BaseAction<User> implements SessionAware {

	@Resource(name="userService")
	private UserService userService ;
	private Map sessionMap;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.sessionMap = session;
	}

	public void index() {
		try {
			ServletActionContext.getResponse().getWriter().write("hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 用戶登錄 需要驗證用戶名 和密碼 1.進行非空驗證 2.進行準確性驗證
	 */
	public void login() {
		if (null == model) {
			ret("請求有誤 request error ！");
			return ;
		}
		System.out.println(model.toString());
		if (!ValidateUtil.isValid(model.getUserName())) {
			// 空
			ret("登录用户名不能为空！ userName empty");
			return ;
		}
		if (!ValidateUtil.isValid(model.getPassWord())) {
			ret("登录密码不能为空！ passWord empty");
			return ;
		}
		User user = userService.validateLoginInfo(model.getUserName(), DataUtil.md5(model.getPassWord()));
		if (null == user) {
			ret("用户名和密码不匹配！ userName || passWord");
			return ;
		}
		this.sessionMap.put("currentUser", user);
	}


}
