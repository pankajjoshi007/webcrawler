package com.pru.casestudy.webcrawler.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.pru.casestudy.webcrawler.model.ExternalLink;
import com.pru.casestudy.webcrawler.model.SiteMap;
import com.pru.casestudy.webcrawler.model.SitePage;
import com.pru.casestudy.webcrawler.model.StaticContent;

public class WebCrawlerServiceImpl implements WebCrawlerService {

	@Override
	public SiteMap getSiteMap(String url) throws IOException {

		Document doc = Jsoup.connect(url).get();
		Elements links = doc.select("a[href]");
		Elements media = doc.select("[src]");

		// Links to pages under the same domain..
		print("\nPages under the same domain: (%d)", links.size());
		
		Set<SitePage> pages = new HashSet<>();
		Set<ExternalLink> extLinks = new HashSet<>();
		for (Element link : links) {
			
		if(! link.attr("abs:href").startsWith(url)) {
				print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
				ExternalLink page = new ExternalLink(trim(link.text(), 35), link.attr("abs:href"));
				extLinks.add(page);
			}else {
				print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
				SitePage page = new SitePage(trim(link.text(), 35), link.attr("abs:href"));
				pages.add(page);
			}
		}

		// Links to static content such as images..
		print("\n Static content such as images : (%d)", media.size());

		Set<StaticContent> images = new HashSet<>();
		for (Element src : media) {
			if (src.tagName().equals("img")) {
				StaticContent image = new StaticContent(trim(src.attr("alt"), 20), src.attr("abs:src"));
				print(" * %s: <%s> %sx%s (%s)", src.tagName(), src.attr("abs:src"), src.attr("width"),
						src.attr("height"), trim(src.attr("alt"), 20));
				images.add(image);
			}
		}
		SiteMap siteMap = new SiteMap(pages, extLinks, images);
		return siteMap;
	}

	private static void print(String msg, Object... args) {
		System.out.println(String.format(msg, args));
	}

	private static String trim(String s, int width) {
		if (s.length() > width)
			return s.substring(0, width - 1) + ".";
		else
			return s;
	}

}
