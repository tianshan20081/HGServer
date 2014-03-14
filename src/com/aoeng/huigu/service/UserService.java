/**
 * 
 */
package com.aoeng.huigu.service;

import com.aoeng.huigu.model.User;

/**
 * @author paynet  Mar 13, 2014 6:53:25 PM
 * 
 */
public interface UserService extends BaseService<User> {

	/**
	 * @param username
	 * @param md5
	 * @return
	 */
	User validateLoginInfo(String username, String md5);

}
