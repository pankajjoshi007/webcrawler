package com.pru.casestudy.webcrawler.model;

public class SitePage {

	public SitePage(String pageName, String pageUrl) {
		super();
		this.pageName = pageName;
		this.pageUrl = pageUrl;
	}

	public SitePage() {
		super();
	}

	private String pageName;
	private String pageUrl;

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

}
