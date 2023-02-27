package javacollectionframeworktest;

import java.util.PriorityQueue;
import java.util.Queue;

public class JCFPriorityQueue {

	public static void main(String[] args) {
		
		Queue<Double> q = new PriorityQueue<>();
		// add in any order
		q.add(10.1);
		q.add(3.3);
		q.add(5.2);
		
		//to string does not work in this instance
		System.out.println("Order" +q.toString());

		
		int loop =1;
		while(loop<=q.size()) {
			System.out.println(q.peek());
			q.poll();
		}
	}

}
