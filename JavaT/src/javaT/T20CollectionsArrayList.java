package javaT;

import java.util.ArrayList;
import java.util.Collections;

public class T20CollectionsArrayList {
	
	//ArrayList is type of collection. if we say ArrayList int[]  = {1,2,3,4,5}; it will
	//hold only integer value, to hold diff datatype values , we can use collections i.e 
	//ArrayList al = new ArrayList(); which will hold diff datatype value.

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("text");
		al.add(22.3);
		al.add(true);
	
		System.out.println(al);
		
		//like wise we can add, remove, size,get
		//al.size();
		//al.remove(0);//index or pass directly value
		//al.add() will add ele at end of arraylist, al.add(index,value) will add
		//at specific index
		//System.out.println(al.get(2));
		//	Collections.sort(al);
		//Collections.reverse(al);
		//Collections.shuffle(al);
		
		
		//reading value using for loop
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

	}

}
