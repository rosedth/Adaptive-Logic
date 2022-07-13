package org.rossedth.adaptive_logic;

import java.util.List;

public class Reasoner {
	private Memory Mem;
	private Selector sel;
	private List<Plan> responses;

	public Reasoner(Memory mem) {
		this.Mem=mem;
	}

	public void setSelector(Selector sel) {
		this.sel=sel;
	}
	
	public void process(Data data) {
	}
	
	public void setResponses(List<Plan> responses) {
		this.responses=responses;
	}
	
	public void sendResponses(){
		sel.selectResponse(responses);
	}
	
}
