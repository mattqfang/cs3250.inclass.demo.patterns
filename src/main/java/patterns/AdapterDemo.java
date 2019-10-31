package patterns;

import uvu.cs.cs3250.demo.patterns.adapter.WebPageClassAdapter;
import uvu.cs.cs3250.demo.patterns.adapter.WebPageObjectAdapter;
import uvu.cs.cs3250.demo.patterns.model.Document;
import uvu.cs.cs3250.demo.patterns.model.PDF;
import uvu.cs.cs3250.demo.patterns.model.WebPage;

public class AdapterDemo {

	public static void main(String[] args) {
		Document pdf = new PDF("dummy.pdf");
		printDoc(pdf);
		
		Document page = new WebPageClassAdapter("http://url1.com");
		printDoc(page);
		
		Document page2 = new WebPageObjectAdapter("https://url2.net");
		printDoc(page2);
	}
	
	private static void printDoc(Document doc) {
		doc.open();
		doc.view();
		doc.close();
	}

}
