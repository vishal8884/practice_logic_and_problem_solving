package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(1,"aaab",25000);
		Employee e2 = new Employee(2,"bbb",34000);
		Employee e3 = new Employee(3,"ccc",12000);
		Employee e4 = new Employee(4,"ddd",28000);
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
		for(Employee e : employeeList) {
			System.out.println("salary before :: "+e.getSalary());
		}
		
		//method 1/////////////////////////////////////////////////////////////////////////////////////// 
		Comparator<Employee> employeeComparator = new Comparator<>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary() > o2.getSalary()) {
					return 1;
				}
				if(o1.getSalary() < o2.getSalary()) {
					return -1;
				}
				else {
					return 0;
				}
			}
		};
		
		
		//method2////////////////////////////////////////////////////////////////////////////////////////
		Comparator<Employee> employeeComparator2 = Comparator.comparing((e) -> e.getSalary(),(a,b) -> {
			return a.compareTo(b);
		});
		
		Collections.sort(employeeList,employeeComparator2);
		
		System.out.println();
		
		for(Employee e : employeeList) {
			System.out.println("salary after :: "+e.getSalary());
		}
	}

}
