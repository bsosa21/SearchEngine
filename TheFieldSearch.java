//Brandon Sosa
//00779788
//A sample Field Search Class


package org.uiowa.cs2820.engine;
import java.util.*;


public class TheFieldSearch {
	
	Integer<database> lookups;	//A database of integers
	int a = 2;
	
	public void FindMatch() throws Exception {
		TheFieldSearch T = new TheFieldSearch();	//Creates a new Field Search
		
		//Searching the keys in the database of equal value to a
		for (database f: lookups) {
			System.out.print("Lookup: "+ a);		//Create a 'search' value (a)
			System.out.print(" in " + f.getKeys);	//Parse through the keys of the database
			Integer[] match = T.FindEquals(a);  	//Find the keys equal to a
			for (Integer f: match) {
				System.out.println("Found "+match); //Print the right amount of matches
		
			}
		}
		  
	}

} 
