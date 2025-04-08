package collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class IntegerListLinkedList {

	public static void main(String[] args) {
		List<Integer> li=new LinkedList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		
		li.add(3, 5);
		li.addFirst(0);
		li.addLast(6);
		System.out.println(li);
	
	List<Integer> l=new ArrayList<Integer>();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.addFirst(0);
	System.err.println(l);
}
}
