package com.undertale.state;

import java.util.ArrayList;

import com.undertale.model.Arm;
import com.undertale.model.Inventory;
import com.undertale.model.Item;
import com.undertale.model.RedPotion;
import com.undertale.model.Room;
import com.undertale.model.UndertaleMap;

public class UsePotionState implements State{
	public void doAction(UseContext useContext, UndertaleMap map) {
	      useContext.setState(this); 
	      float hp = map.getCharactor().getHP();
	      int itemtoUse = 1;
		  Inventory inventory = map.getCharactor().getMyInventory();
		  ArrayList<Item> items = inventory.getItems();
		  boolean itemFound = false ;
          for(int i = 0;i < items.size(); i++){
			    int item = items.get(i).getId();
				if(itemtoUse==item) {
					itemFound = true;
					break;					
				}
		  }
          
		  RedPotion potion = new RedPotion(1, "a red [potion]", "this red potion can add hp", 5);
		  if(itemFound && hp <= 80) {
		    	System.out.println("Player is using potion...");
				hp += 20;
			    map.getCharactor().setHP(hp);
				System.out.println("hp="+ hp);
				map.getCharactor().getMyInventory().deleteItem(potion);
				System.out.println("Item used.");
		  }
		  else if(itemFound && (hp > 80 && hp < 100)) {
			  System.out.println("Player is using potion...");
			  hp = 100;
			  map.getCharactor().setHP(hp);
			  System.out.println("hp="+ hp);
			  map.getCharactor().getMyInventory().deleteItem(potion);
			  System.out.println("Item used.");
		  }
		  else if(!itemFound){
				System.out.println("Failed! Item not found.");
		  }
		  else if(hp==100) {
				System.out.println("Failed! HP is full.");
		  }
	   }
}
