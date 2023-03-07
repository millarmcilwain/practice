/**
 * 
 */
package p3beerv2;

/**
 * @author Millar McIlwain
 *
 */
public class Beer {

	String beerName, BeerStyle, Country;
	double alcoholPercentage;

	/**
	 * @param beerName
	 * @param beerStyle
	 * @param country
	 * @param alcoholPercentage
	 */
	public Beer(String beerName, String beerStyle, String country, double alcoholPercentage) {
		super();
		this.beerName = beerName;
		BeerStyle = beerStyle;
		Country = country;
		this.alcoholPercentage = alcoholPercentage;
	}

	/**
	 * @return the beerName
	 */
	public String getBeerName() {
		return beerName;
	}

	/**
	 * @param beerName the beerName to set
	 */
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}

	/**
	 * @return the beerStyle
	 */
	public String getBeerStyle() {
		return BeerStyle;
	}

	/**
	 * @param beerStyle the beerStyle to set
	 */
	public void setBeerStyle(String beerStyle) {
		BeerStyle = beerStyle;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return Country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		Country = country;
	}

	/**
	 * @return the alcoholPercentage
	 */
	public double getAlcoholPercentage() {
		return alcoholPercentage;
	}

	/**
	 * @param alcoholPercentage the alcoholPercentage to set
	 */
	public void setAlcoholPercentage(double alcoholPercentage) {
		this.alcoholPercentage = alcoholPercentage;
	}

	@Override
	public String toString() {
		return "Beer [beerName=" + beerName + ", BeerStyle=" + BeerStyle + ", Country=" + Country
				+ ", alcoholPercentage=" + alcoholPercentage + "]";
	}

}
