package javacollectionframeworktest;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

	public static void main(String[] args) {


		Map<Integer, Contact> phoneNumbers = new HashMap<>();
		
		Contact c1 = new Contact();
		c1.setfName("Aidan");
		c1.setlName("McG");
		c1.setEmail("a@qub.ac.uk");
		
		Contact c2 = new Contact("Una","McG","una@qub.ac.uk");
		
		phoneNumbers.put(1, c1);
		phoneNumbers.put(2, c2);
		
		phoneNumbers.put(3, new Contact("Niamh","McGo","nini@qub.ac.uk"));
		
		Contact c3 = phoneNumbers.get(3);
		System.out.println(c3.toString());
		
		for (Integer key : phoneNumbers.keySet()) {
			System.out.println(key +" " +phoneNumbers.get(key).getEmail() );
		}

	}
 
}
