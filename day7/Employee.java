package day7;
import java.io.Serializable;
import java.util.TreeSet;
public class Employee implements Serializable, Comparable<Employee> {// POJO class
	private int empid;
	private String name;
	private double salary;
	private String Department;
	
	public String getDepartment() {
		return Department;
	}

//	public void setDepartment(String department) {
//		Department = department;
//	}

	TreeSet<String> skills;
	
	public int getEmpid() {
		return empid;
	}
	
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
		
	}
	public TreeSet<String> getSkills()
	{
		return skills;
	}

	

	public Employee(int empid, String name, double salary, String department, TreeSet<String> skills) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		Department = department;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", skills=" + skills + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		
		return this.empid - o.empid;
	}
	
	

}
