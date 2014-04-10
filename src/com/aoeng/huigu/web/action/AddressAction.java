/**
 * 
 */
package com.aoeng.huigu.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.aoeng.huigu.model.Address;
import com.aoeng.huigu.service.AddressService;
import com.aoeng.huigu.util.JsonUtils;

/**
 * @author paynet Mar 19, 2014 12:29:46 PM
 * 
 */
@Controller("addressAction")
public class AddressAction extends BaseAction<Address> {

	@Resource
	private AddressService addressService;
	private int aid;

	public void save() {
		addressService.saveEntity(model);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "1");

		JsonUtils.toJson(map);
	}

	public void list() {
		List<Address> as = addressService.getAllAddress();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "1");
		map.put("addressList", as);
		map.put("addressSize", as.size());

		JsonUtils.toJson(map);
	}

	public void del() {
		Address t = addressService.findEntity(aid);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "1");
		if (null != t) {
			addressService.delEntity(t);
			map.put("statusDes", "delSuccess");

		} else {
			map.put("statusDes", "Not found the Entity !");
		}
		JsonUtils.toJson(map);

	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	

}
