package day9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import day7.Employee;

public class EmployeeStream {
	public static List<Employee> initializeEmployeeData()
	{
		List<Employee> emps= new ArrayList<>();
		TreeSet<String> skills1=new TreeSet<>();
		skills1.add("java");
		skills1.add("python");
		Employee e1= new Employee(565, "aaa", 70000,"IT", skills1);
		TreeSet<String> skills2=new TreeSet<>();
		skills2.add("java");
		skills2.add("javascript");
		Employee e2= new Employee(111, "aasss", 75000,"CS", skills2);
		TreeSet<String> skills3=new TreeSet<>();
		skills3.add("c++");
		skills3.add("python");
		Employee e3= new Employee(211, "aaaefsss", 75000,"IT", skills3);
		TreeSet<String> skills4=new TreeSet<>();
		skills4.add("c++");
		skills4.add("c");
		Employee e4= new Employee(1311, "aasaefss", 7534000,"Game", skills4);
	
	
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		return emps;
	}

	public static void main(String[] args) {
		List<Employee> emplist= initializeEmployeeData();
		Stream<Employee> stream= emplist.stream();
		
		Comparator<Employee> byname= Comparator.comparing(Employee::getName);
		System.out.println("Sorting by name");
		stream.sorted(byname).forEach(System.out::println);
		
		Comparator<Employee> deptdata= Comparator.comparing(Employee::getDepartment).thenComparing(byname);
		stream = emplist.stream();
		System.out.println("Sorting by name in dept");
		stream.sorted(byname).forEach(System.out::println);
		
		stream = emplist.stream();
		System.out.println("Department wise Employee List");
		stream.collect(Collectors.groupingBy(Employee::getDepartment)).forEach((k,v)-> System.out.println(k+":"+v));
		
		stream = emplist.stream();
		System.out.println("Department wise Total Salary");
		Map<String, Double> salbydept= stream.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
		salbydept.forEach((k,v)->System.out.println("Department : "+k+" "+" : Total Salary : "+ v));
		
		stream = emplist.stream();
		System.out.println("After salary increment");
		stream.map((emp)-> new Employee(emp.getEmpid(),emp.getName(),emp.getSalary()*1.1,emp.getDepartment(),emp.getSkills())).forEach(System.out::println);
		
		stream = emplist.stream();
		System.out.println("Employees who know java");
		stream.filter((emp)->emp.getSkills().contains("java")).forEach(System.out::println);
		
		stream = emplist.stream();
		System.out.println("Min, Max, Average Salary");
		OptionalDouble minsal= stream.mapToDouble(Employee::getSalary).min();
		stream.filter((emp)->emp.getSkills().contains("java")).forEach(System.out::println);
		System.out.println(minsal.getAsDouble());
		
		OptionalDouble maxsal= stream.mapToDouble(Employee::getSalary).max();
		stream.filter((emp)->emp.getSkills().contains("java")).forEach(System.out::println);
		System.out.println(maxsal.getAsDouble());
		
		OptionalDouble avesal= stream.mapToDouble(Employee::getSalary).average();
		stream.filter((emp)->emp.getSkills().contains("java")).forEach(System.out::println);
		System.out.println(avesal.getAsDouble());
		
		
		

		
	
	}

}
