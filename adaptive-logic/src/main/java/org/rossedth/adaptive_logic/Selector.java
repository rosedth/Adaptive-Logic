package org.rossedth.adaptive_logic;

import java.util.List;

public class Selector {
	private Memory Mem;
	private Executor ex;
	private Plan response;
	
	public Selector(Memory mem) {
		this.Mem=mem;
	}

	public void setExecutor(Executor ex) {
		this.ex=ex;
	}
	
	public void selectResponse(List<Plan> responses) {
	}
	
	public void setResponse(Plan  response) {
		this.response=response;
	}
	
	public void sendData(){
		ex.command(response);
	}

}
