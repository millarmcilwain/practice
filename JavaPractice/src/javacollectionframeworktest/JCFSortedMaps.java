package javacollectionframeworktest;

import java.util.Map;
import java.util.TreeMap;

public class JCFSortedMaps {

	public static void main(String[] args) {
		
		Map<Integer, String> mySortedMap = new TreeMap<Integer, String>();
		
		mySortedMap.put(4, "Four");
		mySortedMap.put(1, "One");
		mySortedMap.put(3, "Three");
		mySortedMap.put(2, "Two");
		
		for (Integer key : mySortedMap.keySet()) {
			System.out.println(key + " " +mySortedMap.get(key));
		}
	}

}
