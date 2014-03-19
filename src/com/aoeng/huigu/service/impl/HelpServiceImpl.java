/**
 * 
 */
package com.aoeng.huigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aoeng.huigu.dao.BaseDao;
import com.aoeng.huigu.model.Help;
import com.aoeng.huigu.service.HelpService;

/**
 * @author paynet Mar 19, 2014 10:21:53 AM
 * 
 */
@Service("helpService")
public class HelpServiceImpl extends BaseServiceImpl<Help> implements HelpService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.HelpService#getAllHelps()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aoeng.huigu.service.impl.BaseServiceImpl#setDao(com.aoeng.huigu.dao.BaseDao)
	 */
	@Resource(name = "helpDao")
	@Override
	public void setDao(BaseDao<Help> dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

	@Override
	public List<Help> getAllHelps() {
		// TODO Auto-generated method stub
		String hql = "from Help h order by h.id ";
		return this.findEntityByHql(hql);
	}

	/* (non-Javadoc)
	 * @see com.aoeng.huigu.service.HelpService#getAllHelpTitle(java.lang.String)
	 */
	@Override
	public List<Help> getAllHelpTitle(String version) {
		// TODO Auto-generated method stub
		String hql = "from Help h where h.version= ? ";
		return this.findEntityByHql(hql, new String[]{version});
	}

}
