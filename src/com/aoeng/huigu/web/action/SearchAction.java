package com.aoeng.huigu.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;

import com.aoeng.huigu.SystemContext;
import com.aoeng.huigu.model.Product;
import com.aoeng.huigu.model.SearchItem;
import com.aoeng.huigu.service.ProductService;
import com.aoeng.huigu.util.JsonUtils;

/**
 * @author paynet Mar 18, 2014 9:58:28 AM
 * 
 */
@Controller("searchAction")
public class SearchAction extends BaseAction<Product> {

	private String keyWord;
	private String offSet;
	private String pageSize;
	private String orderBy;

	@Resource
	private ProductService productService;

	public void info() {
		// sale_down(销量降序)，price_up(价格升序)，price_down(价格降序)，comment_down(评价降序)，
		// shelves_down(上架降序)。目前只有价格有双向排序，其他都只有降序，其中默认为sale_down
		Map<String, Object> map = new HashMap<String, Object>();

		String orderStr = "";
		if (StringUtils.isEmpty(keyWord)) {
			map.put("response", "empty");
			JsonUtils.toJson(map);
			return;
		}
		String hql = " from Product r where r.name like ?  ";
		if (!StringUtils.isEmpty(orderBy)) {
			if ("sale_down".equals(orderBy)) {
				orderStr = " order by r.sales desc ";
			} else if ("price_up".equals(orderBy)) {
				orderStr = " order by r.price asc ";
			} else if ("price_down".equals(orderBy)) {
				orderStr = " order by r.price desc ";
			} else if ("comment_down".equals(orderBy)) {
				orderStr = " order by r.score desc ";
			} else if ("shelves_down".equals(orderBy)) {
				orderStr = " order by r.pubDate desc ";
			} else {
				orderStr = " order by r.sales desc ";
			}
			hql += orderStr;
		}
		SystemContext.setOffSet(offSet);
		SystemContext.setPageSize(pageSize);
		List<SearchItem> products = productService.search(hql, new String[] { "%" + keyWord + "%" });
		map.put("response", "search");
		map.put("pros", products);
		if (null != products && products.size() > 0) {
			map.put("proAccount", products.size());
		} else {
			map.put("proAccount", 0);
		}
		JsonUtils.toJson(map);
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public void setOffSet(String offSet) {
		this.offSet = offSet;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

}
