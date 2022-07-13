package org.rossedth.adaptive_logic;

public class Executor {
	private Memory Mem;
	private Object sys_u;
	
	
	public Executor(Memory mem) {
		this.Mem=mem;
	}
	
	// Establishes the reference between the monitor and the system under observation
	public void setSys_U(Object sys) {
		this.sys_u=sys;
	}

	public Object getSysU() {
		return this.sys_u;
	}
	
	public void command(Plan response) {
	}
}
