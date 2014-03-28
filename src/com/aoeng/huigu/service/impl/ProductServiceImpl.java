/**
 * 
 */
package com.aoeng.huigu.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aoeng.huigu.dao.BaseDao;
import com.aoeng.huigu.model.CycleImg;
import com.aoeng.huigu.model.LimitItem;
import com.aoeng.huigu.model.Product;
import com.aoeng.huigu.model.SearchItem;
import com.aoeng.huigu.model.SimplePro;
import com.aoeng.huigu.model.Topic;
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
		List<SimplePro> pros = pros = new ArrayList<SimplePro>();
		if (null != ps && ps.size() > 0) {
			SimplePro sp = null;
			for (Product p : ps) {
				pros.add(new SimplePro(p.getId(), p.getName(), p.getBigPic()[0], "1"));
			}
		}
		return pros;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.ProductService#getCyclePros()
	 */
	@Override
	public List<CycleImg> getCyclePros() {
		// TODO Auto-generated method stub
		String hql = "from Product r order by r.id desc ";
		List<Product> ps = this.findEntityByHqlTop(hql);
		List<CycleImg> pros = new ArrayList<CycleImg>();
		if (null != ps && ps.size() > 0) {
			SimplePro sp = null;
			for (int i = 0; i < (ps.size() > 4 ? 4 : ps.size()); i++) {
				pros.add(new CycleImg(ps.get(i).getId(), ps.get(i).getName(), ps.get(i).getBigPic()[0]));
			}
		}
		return pros;
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
		List<SearchItem> ts = new ArrayList<SearchItem>();
		if (null != pros && pros.size() > 0) {
			for (Product p : pros) {
				ts.add(new SearchItem(p.getId(), p.getName(), p.getPic()[0], p.getPrice(), p.getMarketPrice(),p.getSales()));
			}
		}
		return ts;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.ProductService#getTopicPros()
	 */
	@Override
	public List<Topic> getTopicPros() {
		// TODO Auto-generated method stub
		String hql = "from Product p where p.topic= ? ";
		List<Product> pros = this.findEntityByHqlTop(hql, new Object[] { true });
		List<Topic> ts = new ArrayList<Topic>();
		if (null != pros && pros.size() > 0) {
			for (Product p : pros) {
				ts.add(new Topic(p.getId(), p.getName(), p.getPic()[0]));
			}
		}
		return ts;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.ProductService#getBrandPros()
	 */
	@Override
	public List<Topic> getBrandPros() {
		String hql = "from Product p where p.brand= ? order by p.id ";
		List<Product> pros = this.findEntityByHqlTop(hql, new Object[] { true });
		List<Topic> ts = new ArrayList<Topic>();
		if (null != pros && pros.size() > 0) {
			for (Product p : pros) {
				ts.add(new Topic(p.getId(), p.getName(), p.getPic()[0]));
			}
		}
		return ts;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.ProductService#getLimitBuyPros()
	 */
	@Override
	public List<LimitItem> getLimitBuyPros() {
		// TODO Auto-generated method stub
		String hql = "from Product p where p.limitBuy= ? ";
		List<Product> pros = this.findEntityByHqlTop(hql, new Object[] { true });
		List<LimitItem> ts = new ArrayList<LimitItem>();
		if (null != pros && pros.size() > 0) {
			for (Product p : pros) {
				ts.add(new LimitItem(p.getId(), p.getName(), p.getPic()[0], p.getPrice(), p.getLimitPrice(), p.getLeftTime()));
			}
		}
		return ts;
	}

	/*
	 * 新品上架：最后发布的 100 个商品
	 */
	@Override
	public List<SearchItem> getNewlyPros() {
		// TODO Auto-generated method stub

		String hql = "from Product p order by p.id desc ";
		List<Product> pros = this.findEntityByHqlTop(hql);
		List<SearchItem> ts = new ArrayList<SearchItem>();
		if (null != pros && pros.size() > 0) {
			for (Product p : pros) {
				ts.add(new SearchItem(p.getId(), p.getName(), p.getPic()[0], p.getPrice(), p.getMarketPrice(),p.getSales()));
			}
		}
		return ts;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.ProductService#getSearchPros(java.lang.String)
	 */
	@Override
	public List<SearchItem> getSearchPros(Object... search) {
		String hql = "from Product p where p.name like ? order by p.id desc ";
		List<Product> pros = this.findEntityByHqlTop(hql, search);
		List<SearchItem> ts = new ArrayList<SearchItem>();
		if (null != pros && pros.size() > 0) {
			for (Product p : pros) {
				ts.add(new SearchItem(p.getId(), p.getName(), p.getPic()[0], p.getPrice(), p.getMarketPrice(),p.getSales()));
			}
		}
		return ts;
	}
}
