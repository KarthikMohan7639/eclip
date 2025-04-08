package collections.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentList {
	public String name;
	public int age;
	public int marks;
	

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		StudentList s1=new StudentList();
		s1.name="karthik";
		s1.age=20;
		s1.marks=410;
		
		StudentList s2=new StudentList();
		s2.name="tharun";
		s2.age=21;
		s2.marks=400;
		
		StudentList s3=new StudentList();
		s3.name="madhan";
		s3.age=23;
		s3.marks=390;
		
		
		
		List<StudentList> stdlist=new ArrayList<>();
		stdlist.add(s1);
		stdlist.add(s2);
		stdlist.add(s3);
		
		ArrayList<StudentList> st=new ArrayList<>();
		st.add(s1);
		
		
//		Iterator<StudentList> iter=stdlist.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		
//		for(StudentList i:stdlist) {
//			System.out.println(i);
//		}
		
		
	}

}
