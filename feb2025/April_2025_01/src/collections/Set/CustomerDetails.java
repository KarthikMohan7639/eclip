package collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import collections.List.StudentList;

public class CustomerDetails {

	public static void main(String[] args) {
		Set<String> contact=new HashSet<String>();
		contact.add("7676767676");
		contact.add("7676767676");
		System.out.println(contact);
		
		Set<Integer> set=new HashSet<>(); 
		set.add(10);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		System.out.println(set);
		
		TreeSet<Integer> s=new TreeSet<Integer>();
		s.add(1);
		s.add(4);
		s.add(3);
		s.add(5);
		s.add(9);
		s.add(0);
		
		System.out.println(s);
		
		LinkedHashSet<Integer> t=new LinkedHashSet<Integer>();
		t.add(40);
		t.add(7);
		t.add(80);
		t.add(40);
		
		System.out.println(t);
		
	}

}
