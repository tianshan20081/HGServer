/**
 * 
 */
package com.aoeng.huigu.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aoeng.huigu.dao.BaseDao;
import com.aoeng.huigu.model.Product;
import com.aoeng.huigu.model.SearchItem;
import com.aoeng.huigu.model.SimplePro;
import com.aoeng.huigu.service.ProductService;

/**
 * @author paynet Mar 17, 2014 4:08:56 PM
 * 
 */
@Service("productService")
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.impl.BaseServiceImpl#setDao(com.aoeng.huigu.dao.BaseDao)
	 */
	@Resource(name = "productDao")
	@Override
	public void setDao(BaseDao<Product> dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.ProductService#getNewPros()
	 */
	@Override
	public List<SimplePro> getNewPros() {
		// TODO Auto-generated method stub
		String hql = "from Product r order by r.id desc ";
		List<Product> ps = this.findEntityByHqlTop(hql);
		if (null != ps && ps.size() > 0) {
			List<SimplePro> pros = new ArrayList<SimplePro>();
			SimplePro sp = null;
			for (int i = 0; i < (ps.size() > 4 ? 4 : ps.size()); i++) {
				pros.add(new SimplePro(ps.get(i).getId(), ps.get(i).getName(), ps.get(i).getBigPic()[0], i + ""));
			}
			return pros;
		} else {
			return null;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.ProductService#getHotSalePros()
	 */
	@Override
	public List<SimplePro> getHotSalePros() {
		// TODO Auto-generated method stub
		String hql = "from Product r order by r.id desc ";
		List<Product> ps = this.findEntityByHqlTop(hql);
		if (null != ps && ps.size() > 0) {
			List<SimplePro> pros = new ArrayList<SimplePro>();
			SimplePro sp = null;
			for (Product p : ps) {
				pros.add(new SimplePro(p.getId(), p.getName(), p.getBigPic()[0], "1"));
			}
			return pros;
		} else {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.ProductService#getCyclePros()
	 */
	@Override
	public List<SimplePro> getCyclePros() {
		// TODO Auto-generated method stub
		String hql = "from Product r order by r.id desc ";
		List<Product> ps = this.findEntityByHqlTop(hql);
		if (null != ps && ps.size() > 0) {
			List<SimplePro> pros = new ArrayList<SimplePro>();
			SimplePro sp = null;
			for (int i = 0; i < (ps.size() > 4 ? 4 : ps.size()); i++) {
				pros.add(new SimplePro(ps.get(i).getId(), ps.get(i).getName(), ps.get(i).getBigPic()[0], ""));
			}
			return pros;
		} else {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.ProductService#search(java.lang.String, java.lang.String[])
	 */
	@Override
	public List<SearchItem> search(String hql, String[] objs) {
		// TODO Auto-generated method stub
		List<Product> pros = this.findEntityByHqlTop(hql, objs);
		if (null != pros && pros.size() > 0) {
			List<SearchItem> items = new ArrayList<SearchItem>();
			for (Product p : pros) {
				items.add(new SearchItem(p.getId(), p.getName(), p.getPic()[0], p.getPrice(), p.getMarketPrice()));
			}
			return items;
		}
		return null;
	}
}
