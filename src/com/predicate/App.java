package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {

	private Integer empId;
	private String empName;
	private String empCountry;

	public Employee(Integer empId, String empName, String empCountry) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCountry = empCountry;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCountry() {
		return empCountry;
	}

	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCountry=" + empCountry + "]";
	}

}

public class App {
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee(1002, "Cengizhan", "Ankara");
		Employee e2 = new Employee(1003, "Selin", "Ankara");
		Employee e3 = new Employee(1004, "Chivas", "izmir");
		Employee e4 = new Employee(1005, "Ismail", "istanbul");
		Employee e5 = new Employee(1006, "Salime", "adana");
		Employee e6 = new Employee(1007, "Hilal", "Ankara");
		Employee e7 = new Employee(1008, "Mehmet", "Ankara");
		

		List<Integer> empListId = new ArrayList<Integer>();
		empListId.add(e1.getEmpId());
		empListId.add(e2.getEmpId());
		empListId.add(e3.getEmpId());
		empListId.add(e4.getEmpId());
		empListId.add(e5.getEmpId());
		empListId.add(e6.getEmpId());
		empListId.add(e7.getEmpId());

		System.out.println("Employee even Ids");
		evaluate(empListId, (n)-> n%2==0);
		System.out.println("Employee odd Ids");
		evaluate(empListId, (n)-> n%2!=0);
		System.out.println("Employee bigger 1005 Ids");
		evaluate(empListId, (n)-> n>=1005);
		

	}
	
	public static void evaluate(List<Integer> empListId, Predicate<Integer> predicate) {
		for(Integer emp : empListId) {
			if(predicate.test(emp)) {
				System.out.println(emp);
			}
		}
	}
}
