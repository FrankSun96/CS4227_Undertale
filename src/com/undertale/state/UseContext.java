package com.undertale.state;


public class UseContext {
	private State state;
	public UseContext(){
	      state = null;
    }
 
    public void setState(State state){
       this.state = state;     
    }
 
    public State getState(){
       return state;
   }
}
