package com.aoeng.huigu.web.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.aoeng.huigu.model.AppLogsInfo;

/**
 * 
 * @author aoeng
 *
 */
@Controller("appLogs2Action")
public class AppLogs2Action extends BaseAction<AppLogsInfo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1345423725999003613L;

	private List<File> uploads = new ArrayList<File>();
	private String name;

	public List<File> getUpload() {
		return this.uploads;
	}

	public void setUpload(List<File> uploads) {
		this.uploads = uploads;
	}


	public void upload() throws Exception {

		System.out.println("\n\n upload1");
		System.out.println("files:");
		for (File u : uploads) {
			System.out.println("*** " + u + "\t" + u.length());
		}
		System.out.println("\n\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
