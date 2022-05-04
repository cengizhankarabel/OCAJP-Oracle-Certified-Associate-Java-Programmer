package com.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
	
	public void sortEmployeeByCountry(List<Employee> empList) {
		empList.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
	}
	
	
	public void sortEmployeeById(List<Employee> emplist) {
		emplist.sort((Employee emp1, Employee emp2)->
		emp1.getId().compareTo(emp2.getId()));
	}
	
	public int sumPlusTwo(int a){
		
		a-> return a+2;
	}
	
	public static void main(String[] args) {

//		Employee.getEmpList();
//
		List<Employee> emplist = Employee.getEmpList();
		
		System.out.println(emplist);
		emplist.sort((emp1, emp2)-> emp1.getId().compareTo(emp2.getId()));
		System.out.println(emplist);
//		
		//App ap = new App();
//		ap.sortEmployeeById(emplist);
//		
//		for(Employee emp: emplist) {
//			System.out.println(emp);
//		}
		
		//ap.sumPlusTwo(10);
		
		
		
//		List<Employee> emplist = Employee.getEmpList();
//		
//		Comparator<Employee> comparator = (Employee e1, Employee e2)->
//		e1.getId().compareTo(e2.getId());
//		
//		emplist.sort(comparator);
//		
		
//		(( emp:emplist)-> System.out.println(emp));
		
//		(List<Employee> empList)-> System.out.println();
		
		
		
		

//		System.out.println(emplist);
//
//		// Collections.sort(emplist, new EmployeeComparator());
//
//		emplist.sort(new EmployeeComparator());
//
//		for (Employee emp : emplist) {
//			System.out.println(emp.name);
//		}
		
		
	}

}
