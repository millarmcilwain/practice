package crud;

public class Country {

	private String name, region;
	private int population, area;
	double density;
	
	
	public Country() {
		
	}
	
	public Country(String name, String region, int population, int area) {
		super();
		this.name = name;
		this.region = region;
		this.population = population;
		this.area = area;
	
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
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
	
	public void printAll() {
		System.out.println(this.getName()+" " +this.getRegion() +" " +this.getPopulation() +" " +this.getArea() );
	}
	
	
}
