/**
 * 
 */
package com.aoeng.huigu.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.aoeng.huigu.SystemContext;
import com.aoeng.huigu.model.CycleImg;
import com.aoeng.huigu.model.Product;
import com.aoeng.huigu.model.SimplePro;
import com.aoeng.huigu.service.ProductService;
import com.aoeng.huigu.util.JsonUtils;

/**
 * @author paynet Mar 17, 2014 11:44:12 AM
 * 
 */
@Controller("homeAction")
@Scope("prototype")
public class HomeAction extends BaseAction<Product> {

	@Resource(name = "productService")
	private ProductService productService;

	public void infos() {

		List<CycleImg> cyclePros = productService.getCyclePros();
		// 获得 新品
		List<SimplePro> newPros = productService.getNewPros();
		// List<SimplePro> hotSalePros = productService.getHotSalePros();

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("response", "home");
		map.put("cyclePros", cyclePros);
		map.put("classList", newPros);
		// map.put("hotSalePros", hotSalePros);

		JsonUtils.toJson(map);
	}

	public void cycle() {
		SystemContext.setOffSet(0);
		SystemContext.setPageSize(5);
		List<CycleImg> cyclePros = productService.getCyclePros();
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("response", "home");
		map.put("cyclePros", cyclePros);
		map.put("cycleProsSize", cyclePros.size());
		// map.put("hotSalePros", hotSalePros);

		JsonUtils.toJson(map);
	}

}
