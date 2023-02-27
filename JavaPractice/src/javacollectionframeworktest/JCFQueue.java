package javacollectionframeworktest;

import java.util.LinkedList;
import java.util.Queue;

public class JCFQueue {

	public static void main(String[] args) {

		int time = 10;
		
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = time; i>=0; i--) {
			queue.add(i);
			
		}
		
		System.out.println("Queue items" +queue.toString());
		
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
