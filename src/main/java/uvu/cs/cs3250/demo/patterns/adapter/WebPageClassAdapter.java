package uvu.cs.cs3250.demo.patterns.adapter;

import uvu.cs.cs3250.demo.patterns.model.Document;
import uvu.cs.cs3250.demo.patterns.model.WebPage;

public class WebPageClassAdapter extends WebPage implements Document {

	public WebPageClassAdapter(String url) {
		super(url);
	}
	
	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void open() {
		this.gotoUrl();

	}

	@Override
	public void close() {
		System.out.println("no close needed for a web page.");

	}

	@Override
	public void view() {
		this.display();

	}

	@Override
	public void delete() {
		System.out.println("web page cannot be deleted.");

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
