package javacollectionframeworktest;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class JCFPriorityQueueQ2 {

	private static final int LinkedList = 0;

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("Ann");
		l.add("Aidan");
		l.add("Claire");
		l.add("Una");
		
		Queue<String> q = new PriorityQueue<>(l);
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
}

}

