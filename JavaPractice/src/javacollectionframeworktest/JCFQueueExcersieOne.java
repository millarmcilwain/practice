package javacollectionframeworktest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JCFQueueExcersieOne {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> familyMembers = new ArrayList<>();
		
		familyMembers.add("Aidan");
		familyMembers.add("Claire");
		familyMembers.add("Niamh");
		familyMembers.add("Annie");
		familyMembers.add("Una");

		
		Queue<String> queue = new LinkedList<String>(familyMembers);

		while (queue.peek()!=null) {
			System.out.println(queue.poll());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
				/*
		 * for (int i = 0; i<familyMembers.size(); i++) {
		 * System.out.println(queue.remove()); try { Thread.sleep(2000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */
	}

}
