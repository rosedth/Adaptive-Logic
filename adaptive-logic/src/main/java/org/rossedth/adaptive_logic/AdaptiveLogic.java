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
	
	
	public Monitor getMonitor() {
		return Mon;
	}

	public void setMonitor(Monitor mon) {
		this.Mon=mon;
	}

	public Reasoner getReasoner() {
		return Rea;
	}
	public void setReasoner(Reasoner rea) {
		this.Rea=rea;
	}
	
	
	public Selector getSelector() {
		return Sel;
	}

	public void setSelector(Selector sel) {
		this.Sel=sel;
	}


	public Executor getExecutor() {
		return Ex;
	}
	
	public void setExecutor(Executor ex) {
		this.Ex=ex;
	}

	public Memory getMemory() {
		return Mem;
	}

	public Object getSys_u() {
		return sys_u;
	}

}
