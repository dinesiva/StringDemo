package org.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(10);
		l.add("sarav");
		l.add(true);
		l.add(9843750984l);
		l.add(1234.23456);
		l.add(10);
		l.add(30);
		
		System.out.println(l);
		
		boolean equals = l.equals(3);
		System.out.println(equals);
		
		int size = l.size();
		System.out.println(size);
		
		Object object = l.get(4);
		System.out.println(object);
		
		l.set(3, "dinesh");
		System.out.println(l);
		
		boolean contains = l.contains(20);
		System.out.println(contains);
		
		int indexOf = l.indexOf(10);
		System.out.println(indexOf);
		
		int lastIndexOf = l.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		l.remove(6);
		System.out.println(l);
		
		List<Integer> a = new LinkedList();
		
		a.add(40);
		a.add(50);
		a.add(60);
		
	System.out.println(a);
	
		List<Integer> b = new ArrayList();
		b.add(50);
		b.add(70);
		b.add(80);
		b.add(90);	
		System.out.println(b);
		
		//a.retainAll(b);
		System.out.println(a);
		System.out.println(b);
		
		//a.removeAll(b);
		
		System.out.println(a);
		System.out.println(b);
		
		a.addAll(b);
		System.out.println(a);
		
		for(int i =0; i<a.size(); i++) {
			Integer integer = a.get(i);
			System.out.print(integer + " ");
		}
		System.out.println();
		
		for(Integer c:a) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		a.clear();
		System.out.println(a);
	

		List<Integer> y = new ArrayList();
		y.add(50);
		y.add(70);
		y.add(80);
		y.add(90);	
		System.out.println(y);
		List<Integer> z = new ArrayList();
		z.add(50);
		z.add(70);
		z.add(80);
		z.add(90);	
		System.out.println(z);
		

	
	}		
		
		
	}


