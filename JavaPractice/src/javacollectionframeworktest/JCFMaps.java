package javacollectionframeworktest;

import java.util.HashMap;
import java.util.Map;

public class JCFMaps {

	public static void main(String[] args) {
	
		Map<Integer, String> translator = new HashMap<>();
		
		translator.put(1, "uno");
		translator.put(2, "due");
		translator.put(3, "tre");
		
		System.out.println(translator.get(2));
		
		//show all from map
		for (Integer key : translator.keySet()) {
			
			System.out.println(key +" " +translator.get(key));
		}
		
	
	}

}
