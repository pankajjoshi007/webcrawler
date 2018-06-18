package com.pru.casestudy.webcrawler.model;

import java.util.Set;

public class SiteMap {

	public SiteMap() {
		super();
	}

	public SiteMap(Set<SitePage> pages, Set<ExternalLink> externalLinks, Set<StaticContent> staticContents) {
		super();
		this.pages = pages;
		this.externalLinks = externalLinks;
		this.staticContents = staticContents;
	}

	private Set<SitePage> pages;
	private Set<ExternalLink> externalLinks;
	private Set<StaticContent> staticContents;

	public Set<SitePage> getPages() {
		return pages;
	}

	public void setPages(Set<SitePage> pages) {
		this.pages = pages;
	}

	public Set<ExternalLink> getExternalLinks() {
		return externalLinks;
	}

	public void setExternalLinks(Set<ExternalLink> externalLinks) {
		this.externalLinks = externalLinks;
	}

	public Set<StaticContent> getStaticContents() {
		return staticContents;
	}

	public void setStaticContents(Set<StaticContent> staticContents) {
		this.staticContents = staticContents;
	}

}
