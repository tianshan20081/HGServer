/**
 * 
 */
package com.aoeng.huigu.service;

import java.util.List;

import com.aoeng.huigu.model.Help;

/**
 * @author paynet  Mar 19, 2014 10:21:09 AM
 * 
 */
public interface HelpService extends BaseService<Help> {

	/**
	 * @return
	 */
	List<Help> getAllHelps();

	/**
	 * @param version
	 * @return
	 */
	List<Help> getAllHelpTitle(String version);

}
