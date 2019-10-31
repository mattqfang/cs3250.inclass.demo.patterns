package uvu.cs.cs3250.demo.patterns.model;

public class WebPage {
	private String url;
	
	public WebPage(String url) {
		this.url = url;
	}
	
	public void gotoUrl() {
		System.out.println("go to the url: " + url);
	}
	
	public void display() {
		System.out.println("displaying..." + url);
	}
	
	public String getUrl() {
		return url;
	}
}
