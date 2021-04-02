package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class CollectionAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();//dynamic growing, can have duplicate value
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list.size());
		System.out.println(list.get(1));
		//System.out.println(list.get(4));//This will give index out of bound exception
		//ArrayList<String> list1=new ArrayList<String>();
		list.add(0, "2");
		list.add(1, "3");
		System.out.println(list.get(1));
		
		/***********HASHTABLE**************/
		Hashtable<String,String> table = new Hashtable<String,String>();//key value pair, no duplicacy
		table.put("name", "John");//john will be replaced Avi
		table.put("place", "tokyo");
		table.put("addr", "Stewart");
		table.put("name", "Avi");//john will gone and Avi will assigned in key: name
		table.put("name", "Avi");
		
		System.out.println(table.get("name"));
		System.out.println(table.size());
		System.out.println("----------------");
		
		/**********HASHMAP**********/
		HashMap<String,String> table1 = new HashMap<>();//key value pair,  duplicacy value
		table1.put("name", "John");
		table1.put("place", "tokyo");
		table1.put("addr", "Stewart");
		table1.put("name", "Avi");
		table1.put("name", "Avi");
		System.out.println(table1.size());
		
		System.out.println(table.get("name"));
	}

}
