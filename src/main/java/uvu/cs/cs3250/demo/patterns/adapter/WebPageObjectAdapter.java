package uvu.cs.cs3250.demo.patterns.adapter;

import uvu.cs.cs3250.demo.patterns.model.Document;
import uvu.cs.cs3250.demo.patterns.model.WebPage;

public class WebPageObjectAdapter implements Document {
	private WebPage page;
	
	public WebPageObjectAdapter(String url) {
		this.page = new WebPage(url);
	}
	
	@Override
	public String getFileName() {
		return page.getUrl();
	}

	@Override
	public void open() {
		page.gotoUrl();

	}

	@Override
	public void close() {
		System.out.println("no close needed for a web page.");

	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
