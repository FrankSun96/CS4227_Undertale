package com.undertale.state;

public class Context {
	private static HPState hpState;
	private static int hp = 20;

	public Context(HPState state) {
		hpState = state;
	}
   public static void setState(HPState state){
      hpState = state;     
   }
 
   public HPState getState(){
      return hpState;
   }
   public void useItem() {
	   hp += 10;
	   if(hp>=100) {
		   setState(new FullHPState());
	   }
   }
}
