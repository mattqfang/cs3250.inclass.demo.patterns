package uvu.cs.cs3250.demo.patterns.chainofresp;

import java.util.List;

public class FPClient {
	private List<FileHandler> handlers;
	
	public void open(String filename) {
		handlers.parallelStream()
			.filter(h -> h.canOpen(filename))
			.findAny()
			.ifPresentOrElse(h -> h.openUsingFP(filename), ()->System.out.println("not supported"));
	}
	
	public FPClient setHandlers(List<FileHandler> handlers) {
		this.handlers = handlers;
		return this;
	}
}
