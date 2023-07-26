package com.NormalTopics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main (String args[]) {
		Collection values = new ArrayList();
		
		values.add(5);
		values.add(10);
		values.add(7);
		values.add(2);
		values.add(9);
		
		//System.out.println(values);
		
		Iterator it = values.iterator();
		
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
	}
}
