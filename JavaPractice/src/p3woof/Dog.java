/**
 * 
 */
package p3woof;

/**
 * @author millarmcilwain
 *
 */
public class Dog {		
		
	String breed, colour, countryOfOrigin;
	double weight, height, lifeExpectancy;
	
	/**
	 * @param breed
	 * @param colour
	 * @param countryOfOrigin
	 * @param weight
	 * @param height
	 * @param lifeExpectancy
	 */
	public Dog(String breed, double weight, double height, double lifeExpectancy, String colour, String countryOfOrigin) {
		this.breed = breed;
		this.colour = colour;
		this.countryOfOrigin = countryOfOrigin;
		this.weight = weight;
		this.height = height;
		this.lifeExpectancy = lifeExpectancy;
	}
	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}
	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	/**
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	/**
	 * @param countryOfOrigin the countryOfOrigin to set
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * @return the lifeExpectancy
	 */
	public double getLifeExpectancy() {
		return lifeExpectancy;
	}
	/**
	 * @param lifeExpectancy the lifeExpectancy to set
	 */
	public void setLifeExpectancy(double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	
	
	
	
	
	
}
