package crud;

public class Country {

	private String name;
	private int population, area;
	double density;
	
	
	public Country() {
		
	}
	
	public Country(String name, int population, int area, double density) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
		this.density = density;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public double getDensity() {
		return density;
	}
	public void setDensity(double density) {
		this.density = density;
	}
	
	public void popDensity() {
		System.out.println((this.getPopulation()/this.getDensity()));
	}
	
	
}
