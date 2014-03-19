/**
 * 
 */
package com.aoeng.huigu.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.aoeng.huigu.SystemContext;
import com.aoeng.huigu.model.LimitItem;
import com.aoeng.huigu.model.Product;
import com.aoeng.huigu.model.SearchItem;
import com.aoeng.huigu.model.Topic;
import com.aoeng.huigu.service.ProductService;
import com.aoeng.huigu.util.JsonUtils;

/**
 * @author paynet Mar 19, 2014 2:52:03 PM
 * 
 */
@Controller("productAction")
public class ProductAction extends BaseAction<Product> {

	@Resource(name = "productService")
	private ProductService productService;
	private int pageSize;
	private int offSet;

	/**
	 * 促销快报
	 */
	public void topic() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("response", "topic");
		SystemContext.setOffSet(offSet);
		SystemContext.setPageSize(pageSize == 0 ? 10 : pageSize);
		List<Topic> pros = productService.getTopicPros();
		map.put("proList", pros);
		map.put("prosSize", pros.size());

		JsonUtils.toJson(map);
	}

	/**
	 * 推荐品牌
	 * 
	 * @param pageSize
	 */
	public void brand() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("response", "topic");
		SystemContext.setOffSet(offSet);
		SystemContext.setPageSize(pageSize == 0 ? 10 : pageSize);
		List<Topic> pros = productService.getBrandPros();
		map.put("proList", pros);
		map.put("prosSize", pros.size());

		JsonUtils.toJson(map);
	}

	/**
	 * 限时抢购
	 * 
	 * @param pageSize
	 */
	public void limitBuy() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("response", "topic");
		SystemContext.setOffSet(offSet);
		SystemContext.setPageSize(pageSize == 0 ? 10 : pageSize);
		List<LimitItem> pros = productService.getLimitBuyPros();
		map.put("proList", pros);
		map.put("prosSize", pros.size());

		JsonUtils.toJson(map);
	}

	/**
	 * 新品上架 sale_down(销量降序)，price_up(价格升序)，price_down(价格降序)，comment_down(评价降序)， shelves_down(上架降序)。目前只有价格有双向排序，其他都只有降序，其中默认为sale_down
	 * 
	 * @param pageSize
	 */
	public void newProduct() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("response", "topic");
		SystemContext.setOffSet(offSet);
		SystemContext.setPageSize(pageSize == 0 ? 10 : pageSize);
		List<SearchItem> pros = productService.getNewlyPros();
		map.put("proList", pros);
		map.put("prosSize", pros.size());

		JsonUtils.toJson(map);
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setOffSet(int offSet) {
		this.offSet = offSet;
	}

}
