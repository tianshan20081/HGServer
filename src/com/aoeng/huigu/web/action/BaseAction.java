/**
 * 
 */
package com.aoeng.huigu.web.action;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

/**
 * @author paynet Mar 13, 2014 6:38:51 PM
 * @param <T>
 * 
 */
public class BaseAction<T> extends ActionSupport implements ModelDriven<T>, Preparable {

	protected T model;
	protected HashMap<String, Object> respMap = new HashMap<>();

	public BaseAction() {
		try {
			ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class) type.getActualTypeArguments()[0];
			model = clazz.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */

	@Override
	public T getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.Preparable#prepare()
	 */
	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public void ret(String msg) {
		print(msg);
	}

	/**
	 * @param msg
	 */
	private void print(String msg) {
		// TODO Auto-generated method stub
		try {
			ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
			ServletActionContext.getResponse().getWriter().print(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
