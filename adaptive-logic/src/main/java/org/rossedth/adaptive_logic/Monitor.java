package org.rossedth.adaptive_logic;

public class Monitor {
	private Memory mem;
	private Object sys_u;
	private Reasoner rea;
	private Data data;

	public Monitor() {};

	 public Monitor(Memory mem) { 
	 	this.mem=mem; 
	 }
	 
	
	// Establishes the reference between the monitor and the system under observation
	public void setSys_U(Object sys) {
		this.sys_u=sys;
	}
	
	public Object getSysU() {
		return this.sys_u;
	}

	
	// Connects the monitor and the next process
	public void setReasoner(Reasoner rea) {
		this.rea=rea;
	}

	public void saveData(Data data) {
		this.data=data;
	}
	
	public Data getData() {
		return this.data;
	}
	
	public void sense() {
	}
	
	public void sendData() {
		rea.process(data);
	}
}
