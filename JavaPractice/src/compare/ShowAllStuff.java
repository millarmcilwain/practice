package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShowAllStuff {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("Aidan", 23, "Lecturer"));
		employees.add(new Employee("Jimmy", 89, "Admin"));
		employees.add(new Employee("Joe", 34, "HR"));

		Collections.sort(employees, new CompareEmployeeName());
		viewAll(employees);
		
		Collections.sort(employees, new CompareDept());
		viewAll(employees);
		
		//reverse sort - reverse the order
		Collections.sort(employees, new CompareEmployeeNameReverse());
		viewAll(employees);
		
		// sort by age 
		Collections.sort(employees, new CompareEmployeeAge());
		viewAll(employees);
		
	}

	
	public static void viewAll(List<Employee> employee) {
		for (Employee e : employee) {
			System.out.println(e.toString());
		}
	}
}
