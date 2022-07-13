package org.rossedth.adaptive_logic;

public class AdaptiveLogic {
	private Monitor Mon;
	private Reasoner Rea;
	private Selector Sel;
	private Executor Ex;
	private Memory Mem;
	private Object sys_u; // Underlying System
	

	public AdaptiveLogic(){}
	
	// Structure is loaded with proper components 
	public AdaptiveLogic loadAdaptiveComponents(Memory mem, Monitor mon, Reasoner rea, Selector sel, Executor ex) {
		this.Mem=mem;
		this.Mon=mon;
		this.Rea=rea;
		this.Sel=sel;
		this.Ex=ex;
		
	// Connection in between adaptive processes
		this.Mon.setReasoner(Rea);
		this.Rea.setSelector(Sel);
		this.Sel.setExecutor(Ex);
		
		return this;
	}
	

	// Adaptive Logic connects with the underlying system
	public boolean connect(Object sys) {
		boolean result=false;
		
		Mon.setSys_U(sys);
		Ex.setSys_U(sys);
		return result;
	}
	
	public void init() {
		Mon.sense();
		
	}
	public void setMonitor(Monitor mon) {
		this.Mon=mon;
	}

	public void setReasoner(Reasoner rea) {
		this.Rea=rea;
	}
	
	public void setSelector(Selector sel) {
		this.Sel=sel;
	}

	public void setExecutor(Executor ex) {
		this.Ex=ex;
	}

}
