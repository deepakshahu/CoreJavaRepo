package com.nit.hk.suncollections;

import java.util.LinkedHashMap;

public class Test14_HashMapOperations {
	
	public static void main(String[] args) {
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		
		//Operation #1: Finding empty or not
		System.out.println(lhm.isEmpty());  
		
		//Operation #2: Finding size
		System.out.println(lhm.size());
		
		//Operation #3: displaying map
		System.out.println(lhm);
		System.out.println();
		
		//Operation #4: adding entries
		System.out.println("a".hashCode()%16 + " " + lhm.put("a", 1));  //k1.hashCode() -> 97%16
		System.out.println("b".hashCode()%16 + " " + lhm.put("b", 2));
		System.out.println(((Integer)5).hashCode()%16 + " " + lhm.put(5, 3));
		System.out.println(((Double)6.7).hashCode()%16 + " " + lhm.put(6.7, 4));
		System.out.println(((Character)'p').hashCode()%16 + " " + lhm.put('p', 5));
		System.out.println(((Boolean)true).hashCode()%16 + " " + lhm.put(true, 6));
		System.out.println(lhm.put(null, 7));
		System.out.println(lhm.put("a", 8));
		System.out.println(lhm.put(5, 9));
		System.out.println(lhm.put(new B(5,6), 10));
		System.out.println(lhm.put(new B(5,6), 11));
		System.out.println(lhm.put(new B(7,8), 12));
		System.out.println(lhm.put(new B(7,8), new B(3,4)));
		System.out.println(lhm.put(new B(7,8), "a"));
		System.out.println(lhm);  			  //lhm.toString() -> k1.toString() and v.toString()
		System.out.println();
		
		//Operation #5: Searching a key 
		System.out.println(lhm.containsKey("a"));
		System.out.println(lhm.containsKey(new String("a")));
		System.out.println(lhm.containsKey("A"));
		System.out.println(lhm.containsKey(null));
		System.out.println(lhm.containsKey(new B(5,6)));
		System.out.println();
		
		System.out.println(lhm.containsValue(3));  //linear search algo
		System.out.println(lhm.containsValue("a"));  //hashCode() is not used
		System.out.println(lhm.containsValue(new B(3,4)));  //only equals() is used
		
		//Operation #6: retrieving the mapped value of a given key
		System.out.println(lhm);
		System.out.println(lhm.get("a"));
		System.out.println(lhm.get(new String("a")));
		System.out.println(lhm.get("A"));
		System.out.println(lhm.getOrDefault("A", "the key \"A\" is not found"));
		System.out.println(lhm.get(new B(5,6)));
		System.out.println();
		
		//Operation #7: removing entry
		System.out.println(lhm);
		System.out.println(lhm.remove("a"));
		System.out.println(lhm.remove(5, 7));
		System.out.println(lhm);
		
		//Operation #8: replacing the value of the given key
		System.out.println(lhm.put(5, 9));
		System.out.println(lhm.replace('p', 17));
		System.out.println(lhm.replace(true, 6, 18));
		System.out.println(lhm.replace(new B(7,8), 7, 19));
		System.out.println(lhm);
	} 
}
