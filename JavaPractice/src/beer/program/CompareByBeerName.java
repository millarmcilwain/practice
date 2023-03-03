package beer.program;

import java.util.Comparator;

public class CompareByBeerName implements Comparator<Beer> {

	@Override
	public int compare(Beer o1, Beer o2) {
		
		return o1.getBeerName().compareTo(o2.getBeerName());
	}

}
