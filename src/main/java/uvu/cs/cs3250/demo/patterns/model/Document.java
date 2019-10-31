package uvu.cs.cs3250.demo.patterns.model;

public interface Document {
	String getFileName();
	void open();
	void close();
	void view();
	void delete();
	void update();
}
