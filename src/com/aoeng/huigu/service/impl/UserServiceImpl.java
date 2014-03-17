/**
 * 
 */
package com.aoeng.huigu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aoeng.huigu.dao.BaseDao;
import com.aoeng.huigu.model.User;
import com.aoeng.huigu.service.UserService;

/**
 * @author paynet  Mar 13, 2014 6:54:01 PM
 * 
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	/* (non-Javadoc)
	 * @see com.aoeng.huigu.service.impl.BaseServiceImpl#setDao(com.aoeng.huigu.dao.BaseDao)
	 */
	@Resource(name="userDao")
	@Override
	public void setDao(BaseDao<User> dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

	/* (non-Javadoc)
	 * @see com.aoeng.huigu.service.UserService#validateLoginInfo(java.lang.String, java.lang.String)
	 */
	@Override
	public User validateLoginInfo(String username, String md5) {
		// TODO Auto-generated method stub
		return null;
	}


}
