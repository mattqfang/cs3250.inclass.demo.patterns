package uvu.cs.cs3250.demo.patterns.composite;

import java.util.List;

public class SelectableImpl implements Selectable {
	private Selectable parent;
	private List<Selectable> children;
	
	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

}
