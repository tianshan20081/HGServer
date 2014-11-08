package com.aoeng.huigu.web.action;

import java.util.HashMap;

import org.springframework.stereotype.Controller;

import com.aoeng.huigu.util.JsonUtils;
import com.aoeng.huigu.util.QNApi;

@Controller("qnAction")
public class QnApiAction extends BaseAction<Object> {

	public void upToken() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("uptoken", QNApi.getUpToken());
		JsonUtils.toJson(map);
	}
}
