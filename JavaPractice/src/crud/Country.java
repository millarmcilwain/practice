package crud;

public class Country {

	private String name, region;
	private CountryRegion countryRegion, region2test;
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
	
	
	public CountryRegion getRegion() {
		return countryRegion;
	}

	public void setRegion(String region) {
		
		if (region.equalsIgnoreCase("eastern europe") || region.equalsIgnoreCase("western europe")) {
			this.region2test = CountryRegion.Europe;
		} else if (region.equalsIgnoreCase("sub-saharan africa") || region.equalsIgnoreCase("northern africa")) {
			this.region2test = CountryRegion.Africa;
		} else if (region.equalsIgnoreCase("asia")) {
			this.region2test=CountryRegion.Asia;
		} else if (region.equalsIgnoreCase("LATIN AMER. & CARIB")) {
			this.region2test=CountryRegion.Latin_America;
		} else if (region.equalsIgnoreCase("Oceania")) {
			this.region2test=CountryRegion.Oceania;
		} else {
			this.region2test=CountryRegion.Generic;
		}
		
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
		System.out.println(this.getName()+" " +this.getRegion().name() +" " +this.getPopulation() +" " +this.getArea() );
	}
	
	
}
