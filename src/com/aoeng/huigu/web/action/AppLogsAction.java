package com.aoeng.huigu.web.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;

import com.aoeng.huigu.JsonUtil;
import com.aoeng.huigu.model.AppLogsInfo;
import com.aoeng.huigu.model.LogFileUploadResult;
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

		System.out.println("-------------" + name);
		LogFileUploadResult result = new LogFileUploadResult();
		List<String> fileNames = new ArrayList<String>();
		if (null == uploads) {
			result.setStatus(1);
			result.setStatusDesc("the upload file is empty !");
			respMap.put("response", "notlogin");
			respMap.put("result", result);
			JsonUtils.toJson(respMap);
			return;
		}
		String tmepPath = "/home/aoeng/git/HGServer/WebContent/temp";
		try {
			for (int i = 0; i < uploads.length; i++) {
				File dirstFile = new File(tmepPath, uploadFileNames[i]);
				FileUtils.copyFile(uploads[i], dirstFile);
				System.out.println(uploadFileNames[i] + uploads[i].length());
				fileNames.add(uploadFileNames[i]);

				BufferedReader reader = new BufferedReader(new FileReader(dirstFile));
				String str = null;
				AppLogsInfo logsInfo = null;
				StringBuffer buffer = new StringBuffer();
				while ((str = reader.readLine()) != null) {
					logsInfo = new AppLogsInfo();
					logsInfo.setUploadDate(new Date());
					// logsInfo.setExceptionDate(exceptionDate);
					// logsInfo.setDeviceInfo(deviceInfo);
					if (str.contains("------------")) {

					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			result.setStatus(1);
			result.setStatusDesc("There are some errors for Copy file  !");
			respMap.put("response", "notlogin");
			respMap.put("result", result);
			JsonUtils.toJson(respMap);
			return;
		}
		result.setStatus(0);
		result.setStatusDesc("File upload success !");
		result.setFileNames(fileNames);
		result.setFileUploadDate(new Date());
		respMap.put("response", "notlogin");
		respMap.put("result", result);
		JsonUtils.toJson(respMap);

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
