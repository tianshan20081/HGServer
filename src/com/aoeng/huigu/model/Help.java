/**
 * 
 */
package com.aoeng.huigu.model;

/**
 * @author paynet Mar 19, 2014 10:17:01 AM 帮助信息
 */
public class Help {
	/* id */
	private int id;
	/* 帮助标题 */
	private String title;
	/* 帮助内容 */
	private String content;
	/*版本号*/
	private String version ;
	
	public Help() {
		super();
	}

	public Help(int id, String title, String content, String version) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.version = version;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Help [id=" + id + ", title=" + title + ", content=" + content + ", version=" + version + "]";
	}

	
}
