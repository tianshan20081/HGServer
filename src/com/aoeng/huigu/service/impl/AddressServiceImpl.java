/**
 * 
 */
package com.aoeng.huigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aoeng.huigu.dao.BaseDao;
import com.aoeng.huigu.model.Address;
import com.aoeng.huigu.service.AddressService;

/**
 * @author paynet  Mar 19, 2014 12:31:32 PM
 * 
 */
@Service("addressService")
public class AddressServiceImpl extends BaseServiceImpl<Address> implements AddressService {

	/* (non-Javadoc)
	 * @see com.aoeng.huigu.service.impl.BaseServiceImpl#setDao(com.aoeng.huigu.dao.BaseDao)
	 */
	@Resource(name="addressDao")
	@Override
	public void setDao(BaseDao<Address> dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

	/* (non-Javadoc)
	 * @see com.aoeng.huigu.service.AddressService#getAllAddress()
	 */
	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		String hql = "from Address a ";
		return this.findEntityByHql(hql);
	}

}
