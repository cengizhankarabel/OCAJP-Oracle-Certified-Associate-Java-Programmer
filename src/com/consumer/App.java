package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Employee {

	private Integer empId;
	private String empName;
	private String empCountry;
	private double salary;

	public Employee(Integer empId, String empName, String empCountry, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCountry = empCountry;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCountry=" + empCountry + ", salary=" + salary
				+ "]";
	}

}

public class App {
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee(1002, "Cengizhan", "Ankara", 20000.0);
		Employee e2 = new Employee(1003, "Selin", "Ankara", 12000.0);
		Employee e3 = new Employee(1004, "Chivas", "izmir", 89000.0);
		Employee e4 = new Employee(1005, "Ismail", "istanbul", 32000.0);
		Employee e5 = new Employee(1006, "Salime", "adana", 25000.0);
		Employee e6 = new Employee(1007, "Hilal", "Ankara", 17000.0);
		Employee e7 = new Employee(1008, "Mehmet", "Ankara", 10000.0);

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);

		generateReport(empList, e -> System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getSalary()));
	}

	public static void generateReport(List<Employee> empList, Consumer<Employee> consumer) {
		for (Employee e : empList) {
			consumer.accept(e);
		}
	}
}
