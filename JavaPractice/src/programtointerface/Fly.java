/**
 * 
 */
package programtointerface;

/**
 * @author Millar McIlwain
 *
 */
public class Fly implements Pest {

	String name;
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}




	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}




	@Override
	public void doSomethingAnnoying() {
		System.out.println("buzz");
		
	}




	@Override
	public String toString() {
		return "Fly [name=" + name + "]";
	}
	
	

	
	
}
