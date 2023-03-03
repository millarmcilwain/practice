/**
 * 
 */
package beer.program;

/**
 * @author millarmcilwain
 *
 */
public class Beer {

	private String beerName, beerStyle, country;
	private double percent;
	
	
	public Beer() {
		
	}
	
	/**
	 * @param beerName
	 * @param beerStyle
	 * @param country
	 * @param percent
	 */
	public Beer(String beerName, String beerStyle, String country, double percent) {
		super();
		this.beerName = beerName;
		this.beerStyle = beerStyle;
		this.country = country;
		this.percent = percent;
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
		return beerStyle;
	}
	/**
	 * @param beerStyle the beerStyle to set
	 */
	public void setBeerStyle(String beerStyle) {
		this.beerStyle = beerStyle;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the percent
	 */
	public double getPercent() {
		return percent;
	}
	/**
	 * @param percent the percent to set
	 */
	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Beer [beerName=" + beerName + ", beerStyle=" + beerStyle + ", country=" + country + ", percent="
				+ percent + "]";
	}
	
	
	
	
	
}
