package day8;

import java.util.TreeSet;

import day7.Employee;

public class DemoGenericLambda {

	public static void main(String[] args) {
		Function<Integer> square = (n) -> n*n;
		System.out.println(square.apply(12));
		
		Function<String> substring = (str) -> str.substring(4);
		System.out.println(substring.apply("Java is an OO Language"));
		
		Function<Employee> Incrementedsal =
		(emp) -> new Employee(emp.getEmpid(),emp.getName(),emp.getSalary()+5000,emp.getSkills());
		
		TreeSet<String> skills1=new TreeSet<>();
		skills1.add("java");
		skills1.add("python");
		Employee e = Incrementedsal.apply(new Employee(123, "rrr", 50000, skills1));
		System.out.println(e);
	}

}
