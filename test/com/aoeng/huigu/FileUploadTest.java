/**
 * 
 */
package com.aoeng.huigu;

import java.io.File;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

/**
 * @author paynet Aug 18, 2014 9:30:46 AM
 * 
 */
public class FileUploadTest {

	@Test
	public void upload() {
		String url = "http://localhost:8080/up/app/app3_upload";
		File f1 = new File("/home/paynet/git/HGServer/test/com/aoeng/huigu/CommonTest.java");
		File f2 = new File("/home/paynet/git/HGServer/test/com/aoeng/huigu/DataBaseText.java");
		HttpClient client = new DefaultHttpClient();
		MultipartEntityBuilder entity = MultipartEntityBuilder.create();
		// entity.addTextBody("name", "name");
		entity.addBinaryBody("upload", f1);
		// entity.addBinaryBody("upload2", f2);
		HttpPost post = new HttpPost(url);
		post.setEntity(entity.build());

		try {
			HttpResponse response = client.execute(post);
			if (null != response && response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				HttpEntity entity2 = response.getEntity();

				System.out.println(EntityUtils.toString(entity2));
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
