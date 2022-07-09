package org.string;

import java.util.ArrayList;
import java.util.List;

public class CollectionArrayList {

	//collection - interface ---> set, list - subinterface
	//Groups of Objects - elements
	// duplicates, no duplicates
	// ordered , un ordered
	//primitive data types are not allowed in collection
	//Array String Integer etc.. they are objeects
	
//sub interface or collection interface	
	//set - no duplicates element / no ordered
	
	//List - duplicates elements are allowed / insertion order maintained
	
	
//ArrayList
	
	//Array is sizable or fixed size
	//it is collection of similar datatype or allows only homogeneous values
	//here use the keyword is 'length'
	
	//Array + List = ArrayList
	
	//import java.util.ArrayList package
	//it is resizable
	//it is collection of object or Heterogeneous objects are alllowed(different type objects)
	//Data Structure - Glowable array or dynamic array
	// here, use the keyword is 'size'
	//class - package , constructor, methods, variable
	
	/*
	 * when should i go for ArrayList?
	 * Data retrieval is faster (adv)
	 * insertion / deletion /or add / removal of an element at first / middle position needs more shift operators
	
	
	*/
	//add(); return type - boolean
	//its added on listwise or index position using added anywhere
	
	
	//size - total index of object
	
	//contain - boolean return type - we are searching elements  its present or not
	
	//get - find the position using index
	
	//remove() have 2 type - removing the position of index or particular name
	//removeAll()
	
	
	/*difference b/w get and remove
	 
	both will return us the element present in particular index
	get() will not remove particular element from the ArrayList
	remove() will remove the particular element from the arrayList
	
	
	set() - some particular index remove and add one elements
	
	indexOf() - find the particular position in the object
	lastIndexOf() - index position searching to the last
	
	addAll(particular index, addded some elements)
	
	subList(from index ,to, to index) 1st number inculusive & last number exclusive
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 */
	
	public static void main(String[] args) {
		
		int b [][] = new int [2][5]; // fixed size
		
		ArrayList<Object> a = new ArrayList<>();  //flexible
		
		for (int i =0; i<=10; i++) 
			a.add(i);
		System.out.println(a);
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

