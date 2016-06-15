/**
 * 
 */
package com.suman.practice.collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author sumandutta
 *
 */
public class SortedSetTest {

	
	/**
	 * 
	 */
	public SortedSetTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortedSet<String> set  = new TreeSet<String>();
		set.add("Z");
		set.add("E");
		set.add("B");
		set.add("Z");
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			System.out.println("Set value = " + it.next());
		}

	}

}
