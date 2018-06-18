package com.pru.casestudy.webcrawler.model;

public class ExternalLink {
	
	public ExternalLink(String extPageName, String extPageUrl) {
		super();
		this.extPageName = extPageName;
		this.extPageUrl = extPageUrl;
	}

	public ExternalLink() {
		super();
	}

	private String extPageName;
	private String extPageUrl;

	public String getExtPageName() {
		return extPageName;
	}

	public void setExtPageName(String extPageName) {
		this.extPageName = extPageName;
	}

	public String getExtPageUrl() {
		return extPageUrl;
	}

	public void setExtPageUrl(String extPageUrl) {
		this.extPageUrl = extPageUrl;
	}

}
