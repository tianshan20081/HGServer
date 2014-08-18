package com.aoeng.huigu.web.action;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;

import com.aoeng.huigu.model.AppLogsInfo;
import com.aoeng.huigu.service.AppLogsService;
import com.aoeng.huigu.util.JsonUtils;

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
		if (null == uploads) {
			respMap.put("resultCode", "1");
			respMap.put("result", "the upload file is empty !");
			JsonUtils.toJson(respMap);
			return;
		}
		String tmepPath = "/home/paynet/git/HGServer/WebContent/temp";
		try {
			for (int i = 0; i < uploads.length; i++) {
				FileUtils.copyFile(uploads[i], new File(tmepPath, uploadFileNames[i]));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			respMap.put("resultCode", "1");
			respMap.put("result", "the File copy error  !");
		}
		respMap.put("resultCode", "0");
		respMap.put("result", "File upload success  !");

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
