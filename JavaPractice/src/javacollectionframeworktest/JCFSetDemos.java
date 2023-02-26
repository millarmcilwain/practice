package javacollectionframeworktest;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JCFSetDemos {

	public static void main(String[] args) {

		String[] colours = { "red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray",
				"orange" };

		List<String> list = Arrays.asList(colours);

		System.out.println(list.toString());

		printNonDuplicates(list);

	}

	private static void printNonDuplicates(Collection<String> values) {

		Set<String> set = new HashSet<String>(values);
		set.add("pink");
		set.remove("white");
		System.out.println("Non duplicates are: ");
		System.out.println(set.toString());

	}
}
