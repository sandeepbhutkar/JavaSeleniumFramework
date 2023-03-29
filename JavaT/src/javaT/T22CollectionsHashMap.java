package javaT;

import java.util.HashMap;

public class T22CollectionsHashMap {

	public static void main(String[] args) {
		// hash map is similar to dictionary in python
		//has keys and values
		//keys should be unique, if duplicate key used it will replace earlier value
		
		HashMap hm = new HashMap();
		hm.put(101, "sand");
		hm.put(102, "sa");
		hm.put(103, "san");
		
		hm.remove(101);
		
		System.out.println(hm);
		
		

	}

}
