/**
 * 
 */
package p3beerv2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Millar McIlwain
 *
 */
class BeerTest {

	Beer beer = new Beer();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for
	 * {@link p3beerv2.Beer#Beer(java.lang.String, java.lang.String, java.lang.String, double)}.
	 */
	@Test
	void testBeer() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link p3beerv2.Beer#getBeerName()}.
	 */
	@Test
	void testGetSetBeerName() {
		beer.setBeerName("Beer1");
		assertEquals("Beer1", beer.getBeerName());
	}

	/**
	 * Test method for {@link p3beerv2.Beer#getBeerStyle()}.
	 */
	@Test
	void testGetSetBeerStyle() {
		beer.setBeerStyle("BeerStyle");
		assertEquals("BeerStyle", beer.getBeerStyle());
	}


	/**
	 * Test method for {@link p3beerv2.Beer#getCountry()}.
	 */
	@Test
	void testGetSetCountry() {
		beer.setCountry("TestCountry");
		assertEquals("TestCountry", beer.getCountry());
	}

	/**
	 * Test method for {@link p3beerv2.Beer#getAlcoholPercentage()}.
	 */
	@Test
	void testGetSetAlcoholPercentage() {
		beer.setAlcoholPercentage(5.0);
		assertEquals(5.0, beer.getAlcoholPercentage());
	}

	/**
	 * Test method for {@link p3beerv2.Beer#toString()}.
	 */
	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
