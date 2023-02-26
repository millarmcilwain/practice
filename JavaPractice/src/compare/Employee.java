package compare;

public class Employee {

	private String name;
	private int age;
	private String dept;
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
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @param name
	 * @param age
	 */
	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.setDept(dept);
	}


	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
