package Comparator.oldApproach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		Employee2 e1 = new Employee2(1,"aaab",25000);
		Employee2 e2 = new Employee2(2,"bbb",34000);
		Employee2 e3 = new Employee2(3,"ccc",12000);
		Employee2 e4 = new Employee2(4,"ddd",28000);
		
		List<Employee2> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
		for(Employee2 e : employeeList) {
			System.out.println("salary before:: "+e.getSalary());
		}
		
		Collections.sort(employeeList);
		System.out.println();
		
		for(Employee2 e : employeeList) {
			System.out.println("salary after :: "+e.getSalary());
		}
	}

}
