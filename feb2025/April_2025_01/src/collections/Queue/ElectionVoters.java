package collections.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ElectionVoters {

	public static void main(String[] args) {
		Queue<String> Voters=new LinkedList<String>();
		Voters.add("madhan");
		Voters.add("karthik");
		Voters.add("santhosh");
		Voters.add("Lokesh");
		
		System.out.println("front:"+Voters.peek());
		
		System.out.println(Voters);
		
		System.out.println("Last:"+Voters);
		
		System.out.println("Removed:"+Voters.poll());
		
		System.out.println(Voters);
		
		
	}

}
