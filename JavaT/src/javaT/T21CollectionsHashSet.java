package javaT;

import java.util.HashSet;

public class T21CollectionsHashSet {

	public static void main(String[] args) {
		// HashSet cannot ne changed /indexed same as set in python.
		//ArrayList is same in python , it can be changed and indexed.
		
		//HashSet hs = new HashSet();  //default capacity is 16
		HashSet hs = new HashSet(100); //capacity 100
		hs.add(20);
		hs.add(30);
		hs.add("text");
		System.out.println(hs.size());
		hs.remove(20); // can be remove using value as set is not indexed
		System.out.println(hs);
		

	}

}
