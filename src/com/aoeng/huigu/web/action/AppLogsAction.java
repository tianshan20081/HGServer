package com.aoeng.huigu.web.action;

import java.io.File;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.aoeng.huigu.model.AppLogsInfo;
import com.aoeng.huigu.service.AppLogsService;

/**
 * 
 * @author aoeng
 *
 */
@Controller("appLogsAction")
public class AppLogsAction extends BaseAction<AppLogsInfo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1345423725999003613L;
	private File[] uploads;
	private String[] uploadFileNames;
	private String[] uploadContentTypes;
	private String name;

	@Resource(name = "appLogsService")
	private AppLogsService appLogsService;

	public void upload() {
		System.out.println("name " + name);
		System.out.println("upload");
		System.out.println("files:");
		for (File u : uploads) {
			System.out.println("*** " + u + "\t" + u.length());
		}
		System.out.println("filenames:");
		for (String n : uploadFileNames) {
			System.out.println("*** " + n);
		}
		System.out.println("content types:");
		for (String c : uploadContentTypes) {
			System.out.println("*** " + c);
		}
		System.out.println("\n\n");
	}

	public File[] getUpload() {
		return this.uploads;
	}

	public void setUpload(File[] upload) {
		this.uploads = upload;
	}

	public String[] getUploadFileName() {
		return this.uploadFileNames;
	}

	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileNames = uploadFileName;
	}

	public String[] getUploadContentType() {
		return this.uploadContentTypes;
	}

	public void setUploadContentType(String[] uploadContentType) {
		this.uploadContentTypes = uploadContentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
