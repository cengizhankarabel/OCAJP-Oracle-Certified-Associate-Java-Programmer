package com.methodreference;

import java.util.ArrayList;
import java.util.List;

import com.compare.Employee;

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

	public static List<Employee> getEmpList() {

		Employee e1 = new Employee(101, "Aron", "Sr System Engineer");
		Employee e2 = new Employee(102, "Cindia", "System Engineer");
		Employee e3 = new Employee(103, "Zidane", "Technology Lead");
		Employee e4 = new Employee(104, "Emilia", "Technology Architect");
		List<Employee> empList = new ArrayList<>();
		empList.add(e3);
		empList.add(e1);
		empList.add(e2);
		empList.add(e4);

		return empList;
	}

	public static int compareByName(Employee emp1, Employee emp2) {
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}
	
	public static List<Employee> empEvenIdList(List<Employee> empList) {
	
		List<Employee> evenList = new ArrayList<Employee>();
		
		for(Employee emp: empList) {
			if(emp.getEmpId() %2 == 0) {
				evenList.add(emp);
				
			}
			
		}
		return evenList;
	}
	
	
	

}

public class App {

	public static void main(String[] args) {

		List<Employee> empList = Employee.getEmpList();
		List<Employee> evenIdList = Employee.empEvenIdList(empList);
		System.out.println(evenIdList);
		
//		empList.sort((emp1, emp2)-> Employee.compareByName(emp1, emp2));
		
	//	empList.sort(Employee::compareByName);
		//System.out.println(empList);

	}
}
