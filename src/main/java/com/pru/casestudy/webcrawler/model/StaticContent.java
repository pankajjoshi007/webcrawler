package com.pru.casestudy.webcrawler.model;

public class StaticContent {

	public StaticContent() {
		super();
	}

	public StaticContent(String imgName, String imgUrl) {
		super();
		this.imgName = imgName;
		this.imgUrl = imgUrl;
	}

	private String imgName;
	private String imgUrl;

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
