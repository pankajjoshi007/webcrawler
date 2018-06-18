package com.pru.casestudy.webcrawler.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.pru.casestudy.webcrawler.model.SiteMap;

@Service
public interface WebCrawlerService {
	
	/**
	 * @param Url
	 * @return
	 * @throws IOException
	 */
	public SiteMap getSiteMap(String Url) throws IOException;
}
