/**
 * 
 */
package com.aoeng.huigu.service;

import java.util.List;

import com.aoeng.huigu.model.Address;

/**
 * @author paynet  Mar 19, 2014 12:31:02 PM
 * 
 */
public interface AddressService extends BaseService<Address> {

	/**
	 * @return
	 */
	List<Address> getAllAddress();

	/**
	 * @param string
	 * @return
	 */
	Address getAddressByAdsId(String string);

}
