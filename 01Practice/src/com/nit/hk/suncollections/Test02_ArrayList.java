package com.nit.hk.suncollections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test02_ArrayList {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		ArrayList<Object> al1 = new ArrayList<>();

		//System.out.println(al1.capacity());
		//Operation 1: Finding capacity of collection
		//Reflection API code for accessing private members
		Class<?> clazz = al1.getClass();
		Field field = clazz.getDeclaredField("elementData");
		field.setAccessible(true);

		Object[] elementData = (Object[]) field.get(al1);
		System.out.println(elementData.length);

		//Operation 2: Finding size, counting number of objects in collection
		System.out.println(al1.size());

		//Operation 3: Displaying elements available in collection
		System.out.println(al1);
		System.out.println();

		//Operation 4: Adding elements to ArrayList
		al1.add("a");
		al1.add("b");
		al1.add(5);
		al1.add(6.7);
		al1.add('p');
		al1.add(true);
		al1.add("a");
		al1.add(5);
		al1.add(null);
		al1.add(new A(5,6));
		al1.add(null);
		al1.add(null);
		al1.add(new A(7,8));
		al1.add(new A(5,6));

		elementData = (Object[]) field.get(al1);
		System.out.println(elementData.length);
		System.out.println(al1.size());
		System.out.println(al1);

		//Operation 5: Retrieving element from ArrayList		
		System.out.println(al1.get(3));
		System.out.println(al1.get(5));
		//System.out.println(al1.get(-1));  //Rule #1: index>0 || index<size
		//System.out.println(al1.get(14));  //Rules: index>0 || index<size
		//System.out.println(al1.get(15));  //Rules: index>0 || index<size

		//String s1 = al1.get(1);  //Rule #2: we cannot assign element to a variable of returning object type Ex : String
		//Because element is returned as Object type, we must assign it to Object type variable
		//later we must type case to return object type
		Object obj;
		obj = al1.get(1);
		//System.out.println(obj.toUpperCase());  //Rule #3: cannot invoke return object specific methods by using object type ref

		//String s1 = (String) obj;  //Rule #4: We must not type case directly, we may get CCE, bcoz collection is heterogeneous

		//if(obj instanceof String) {  //Old style
		//	String s1 = (String) obj;
		//if(obj instanceof String s1)  //This feature will work in java16(PatternMatching)
		//	System.out.println(s1.toUpperCase());
		//}
		System.out.println();

		//Retrieving all elements from Arraylist
		for(int i=0; i<al1.size(); i++) {    //Rule #4: Condition operator must be < but not >=. If <= is used then there must
			System.out.println(al1.get(i));  //be al1.size()-1 
		}
		System.out.println();

		//for(int i=0; i<=al1.size(); i++) {    //Here O/P: element1 ... end element + RE: IOOBE
		//for(int i=0; i<=al1.size()-1; i++) {  //Here O/P: element1 ... end element
		for(int i=0; i<al1.size()-1; i++) {     //Here O/P: element1 ... end-1 element
			System.out.println(al1.get(i)); 
		}
		System.out.println();

		for(int i=0; i<al1.size(); i++) {     //Here O/P: only a is display for al1.size() times
			System.out.println(al1.get(0)); 
		}
		System.out.println();

		//Operation 6: Searching an object - implicitly equals() method and == operator are used
		//just knowing available or not
		System.out.println(al1.contains("a"));
		System.out.println(al1.contains("A"));
		System.out.println(al1.contains(5));
		System.out.println(al1.contains(null));
		System.out.println(al1.contains(new A(7,8)));
		System.out.println();

		//knowing in which index this element is available
		System.out.println(al1);
		System.out.println(al1.indexOf("a"));
		System.out.println(al1.indexOf(5));
		System.out.println(al1.indexOf(null));
		System.out.println(al1.lastIndexOf(null));
		System.out.println(al1.lastIndexOf("A"));
		System.out.println(al1.lastIndexOf(new A(3,5)));

		//Update A class object whose data is 7,8 by increasing x by 5 and y by 7
		int index = al1.indexOf(new A(3,5)); 
		if(index >= 0) {
			A a1 = (A) al1.get(index);
			a1.setX(a1.getX()+5);
			a1.setY(a1.getY()+7);
		}
		System.out.println(al1);

		//Operation 7: 	Removing an object from ArrayList
		
		System.out.print(al1.remove(5)+"  ");  //here 5 is index, so 5th index object is removed
		System.out.println(al1);
		System.out.print(al1.remove((Integer)5)+"  ");  //here 5 is object, 5 is removed
		System.out.println(al1);
		System.out.print(al1.remove("a")+"  ");
		System.out.println(al1);
		System.out.print(al1.remove(new String("a"))+"  ");
		System.out.println(al1);
		System.out.print(al1.remove("A")+" ");
		System.out.println(al1);
		System.out.print(al1.remove(6.7)+"  ");
		System.out.println(al1);
		//System.out.print(al1.remove('p')+"  ");
		System.out.print(al1.remove((Character)'p')+"  ");
		System.out.println(al1);
		System.out.print(al1.remove(new A(7,8))+"  ");
		System.out.println(al1);
		System.out.print(al1.remove(null)+"  ");
		System.out.println(al1);
		System.out.println();

		System.out.println(al1);
		ArrayList<Object> al2 = new ArrayList<>();
		al2.add(null);
		al1.removeAll(al2);  //removing all occurrences of an element
		System.out.println(al1);
		
		al1.removeAll(List.of("a"));  //Java 9v static factory method to create, a unmodifiable collection with initialization
		System.out.println(al1);
		al1.removeAll(Arrays.asList(new A(5,6)));  //Java 1.2v static factory method to create, a unmodifiable collection with initialization
		System.out.println(al1);
		
		al1.add("a");
		al1.add(new A(5,6));
		System.out.println();
		
		//al1.clear();
		//System.out.println(al1);
		
		/*for(int i=0; i<al1.size(); i++) {
			Object ele = al1.get(i);
			if(ele instanceof String) {
				al1.remove(i);
			}
		}
		
		for(int i=0; i<al1.size(); i++) {
			Object ele = al1.get(i);
			if(((Integer)ele%2)==0) {
				al1.remove(i);
			}
		}
		
		for(int i=0; i<al1.size(); i++) {
			Object ele = al1.get(i);
			if(ele instanceof A) {
				al1.remove(i);
			}
		}*/
		
		System.out.println(al1);
		al1.removeIf(ele->ele instanceof String);  //Java 8v
		System.out.println(al1);
		al1.removeIf(ele->ele instanceof Integer);  //Java 8v
		System.out.println(al1);
		al1.removeIf(ele->ele instanceof A);  //Java 8v
		System.out.println(al1);
		System.out.println();
		
		//Operation 8: insert new element in ArrayList
		al1.clear();
		al1.add("a");
		al1.add("b");
		al1.add(5);
		al1.add(6.7);
		al1.add(true);
		al1.add(null);
		System.out.println(al1);
		al1.add(2, "C");
		System.out.println(al1);
		
		al1.add(al1.size(), "7");  //Rule 1: index>=0 && index<=size (index==size->add)
		System.out.println(al1);
		
		//al1.add(al1.size()+1, "8");
		//al1.add(-1, "8");
		
		//Operation 9: replacing an existing element with new element
		al1.set(3, 9);           //Rule 1: index>=0 && index<size
		System.out.println(al1);
		
		//al1.set(al1.size(), 10);
		
		//Operation 10: sorting elements
		al1.clear();
		al1.add("a");
		al1.add("c");
		al1.add("b");
		System.out.println(al1);
		al1.sort(null);
		System.out.println(al1);

		ArrayList<Object> al3 = new ArrayList<>(5);
		al3.add(9);
		al3.add(10);
		al3.add(11);
		System.out.println(al3.size());
		System.out.println(al3);
		System.out.println();

		ArrayList<Object> al5 = new ArrayList<>(2);
		System.out.println(al5.size());
		System.out.println(al5);
		System.out.println();

		al5.add(5);
		al5.add(6);
		al5.add(8);

		System.out.println(al5.size());
		System.out.println(al5);
		System.out.println();
	}
}