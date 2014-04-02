/**
 * 
 */
package com.aoeng.huigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aoeng.huigu.dao.BaseDao;
import com.aoeng.huigu.model.ProVO;
import com.aoeng.huigu.service.ProVoService;

/**
 * @author paynet  Apr 2, 2014 6:18:16 PM
 * 
 */
@Service("proVoService")
public class ProVoServiceImpl extends BaseServiceImpl<ProVO> implements ProVoService {

	/* (non-Javadoc)
	 * @see com.aoeng.huigu.service.impl.BaseServiceImpl#setDao(com.aoeng.huigu.dao.BaseDao)
	 */
	@Resource(name="proVoDao")
	@Override
	public void setDao(BaseDao<ProVO> dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

}
