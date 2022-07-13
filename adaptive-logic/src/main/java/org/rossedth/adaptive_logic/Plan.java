package org.rossedth.adaptive_logic;

import java.util.List;

public class Plan {
	protected List<Action> actions;
	
    public Plan() {
    }

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

}
