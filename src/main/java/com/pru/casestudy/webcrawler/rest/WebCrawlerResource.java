package com.pru.casestudy.webcrawler.rest;

import java.io.IOException;
import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pru.casestudy.webcrawler.model.SiteMap;
import com.pru.casestudy.webcrawler.service.WebCrawlerService;
import com.pru.casestudy.webcrawler.service.WebCrawlerServiceImpl;

@RestController
@RequestMapping("/api/webcrawler")
public class WebCrawlerResource {

	/**
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/sitemap", method = RequestMethod.GET)
	public ResponseEntity<SiteMap> getCrawData() throws IOException {
		final String url = "https://www.pru.co.uk/";
		WebCrawlerService crawlerServices = new WebCrawlerServiceImpl();
		SiteMap siteMap = crawlerServices.getSiteMap(url);
		return warpOrNotFound(Optional.ofNullable(siteMap));
	}

	/**
	 * @param mayBeResponse
	 * @return
	 */
	private <X> ResponseEntity<X> warpOrNotFound(Optional<X> mayBeResponse) {
		return mayBeResponse.map(response -> ResponseEntity.ok().headers(new HttpHeaders()).body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

}
