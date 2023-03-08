/**
 * 
 */
package p3dogv2;

/**
 *  dog class
 * @author Millar McIlwain
 *
 */
public class Dog {

	String breed, color, countryOfOrigin;
	double weight, height, lifeExpectancy;
		/**
	 * @param breed
	 * @param color
	 * @param countryOfOrigin
	 * @param weight
	 * @param height
	 * @param lieExpectancy
	 */
	public Dog(String breed, double weight, double height, double lifeExpectancy, String color, String countryOfOrigin ) {

		this.breed = breed;
		this.color = color;
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
		 * @return the color
		 */
		public String getColor() {
			return color;
		}
		/**
		 * @param color the color to set
		 */
		public void setColor(String color) {
			this.color = color;
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
		 * @return the lieExpectancy
		 */
		public double getLifeExpectancy() {
			return lifeExpectancy;
		}
		/**
		 * @param lieExpectancy the lieExpectancy to set
		 */
		public void setLifeExpectancy(double lifeExpectancy) {
			this.lifeExpectancy = lifeExpectancy;
		}
		@Override
		public String toString() {
			return "Breed: " + breed + ", Color: " + color + ", CountryOfOrigin: " + countryOfOrigin + ", weight="
					+ weight + ", height=" + height + ", lifeExpectancy=" + lifeExpectancy ;
		}
		
		
		
		
	
}
