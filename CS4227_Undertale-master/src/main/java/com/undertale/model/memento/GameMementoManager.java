package com.undertale.model.memento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Stack;

public class GameMementoManager {
	private static Stack<GameMemento> GAME_ARCHIVE;
	
	public GameMementoManager() {
		GAME_ARCHIVE = new Stack<GameMemento>();
		initialMemo();
	}
	
	private void initialMemo() {
		FileInputStream fileStream;
		try {
			fileStream = new FileInputStream("./src/archive.dat");
	        ObjectInputStream objectStream = new ObjectInputStream(fileStream);  
	        GameMemento memo = (GameMemento)objectStream.readObject();       
	        objectStream.close();  
	        fileStream.close();
	        GAME_ARCHIVE.push(memo);
		} catch (Exception e) {
		}
	}

	public GameMemento getMemento() {
		try { 
			return GAME_ARCHIVE.pop();
		} catch(Exception ex) {
			return null;
		}
	}
	
	public boolean addMemento(GameMemento memo) {
		FileOutputStream fileStream;
		try {
			fileStream = new FileOutputStream("./src/archive.dat");
			ObjectOutputStream objectStream = new ObjectOutputStream(fileStream); 
			objectStream.writeObject(memo);  
			objectStream.writeObject(null);
	        objectStream.close();
	        fileStream.close();
			GAME_ARCHIVE.push(memo);
			return true;
		} catch (Exception e) {
			return false;
		}  
	}

}
