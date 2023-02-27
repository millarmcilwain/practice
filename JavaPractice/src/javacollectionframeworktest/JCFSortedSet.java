package javacollectionframeworktest;

import java.util.SortedSet;
import java.util.TreeSet;

public class JCFSortedSet {

	public static void main(String[] args) {

		SortedSet<String> sSet = new TreeSet<>();
		sSet.add("Messi");
		sSet.add("Pele");
		sSet.add("Ronaldo");

		System.out.println(sSet.toString());
		System.out.println(sSet.first());
		System.out.println(sSet.last());

		sSet.remove("Ronaldo");

		System.out.println(sSet.toString());

	}

}
