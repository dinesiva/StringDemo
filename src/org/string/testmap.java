package org.string;

import java.util.*;

public class testmap {
	
	public static void main(String[] args) {
		
		Map<String,Integer> m = new HashMap<>();  //Printing random order [key 1 null, value n null]
		
		m.put("GT", 16);
		m.put("CSK", 18);
		m.put("RCB", 19);
		m.put("MI", 20);
		m.put("GT", 25);
		m.put("CSK", 30);
		m.put(null, 30);
		m.put(null, 40);
		m.put("RCB", null);
		m.put("MI", null);
		
		System.out.println(m);
		
		Map<String , Integer> m1 = new LinkedHashMap<>();  //Printing insertion order [key 1 null, value n null]
		
		m1.put("GT", 16);
		m1.put("CSK", 18);
		m1.put("RCB", 19);
		m1.put("MI", 20);
		m1.put("GT", 25);
		m1.put("CSK", 30);
		m1.put(null, 30);
		m1.put(null, 40);
		m1.put("RCB", null);
		m1.put("MI", null);
		
		System.out.println(m1);
		
		Map<String , Integer> m2 = new TreeMap<>();  //Printing Ascending order [key ignore null, value n null]
		
		m2.put("GT", 16);
		m2.put("CSK", 18);
		m2.put("RCB", 19);
		m2.put("MI", 20);
		m2.put("GT", 25);
		m2.put("CSK", 30);
		//m2.put(null, 30);
		//m2.put(null, 40);
		m2.put("RCB", null);
		m2.put("MI", null);
		
		System.out.println(m2);
		
		Map<String,Integer> m3 = new Hashtable<>();  //printing random order [key ignore null, value ignore null]
		
		m3.put("GT", 16);
		m3.put("CSK", 18);
		m3.put("RCB", 19);
		m3.put("MI", 20);
		m3.put("GT", 25);
		m3.put("CSK", 30);
		//m3.put(null, 30);
		//m3.put(null, 40);
		//m3.put("RCB", null);
		//m3.put("MI", null);
		
		System.out.println(m3);
		
		int size = m2.size();
		System.out.println(size);
		
		boolean containsKey = m2.containsKey("CSK");
		System.out.println(containsKey);
		
		boolean containsValue = m2.containsValue(25);
		System.out.println(containsValue);
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
