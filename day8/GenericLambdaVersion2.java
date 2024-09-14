package day8;

import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import day7.Employee;

public interface GenericLambdaVersion2 {
//	public static <T> T operateOnData (Function<T> func,T data)
//	{
//		return func.apply(data);
//	}
	public static <T> List<T> operateOnData (Function<T> func, List<T> lst)
	{
		List<T> mapped = new ArrayList<>();
		for(T item : lst)
		{
			mapped.add(func.apply(item));
		}
		return mapped;
	}
	
	
	public static void main(String[] args) {
//		System.out.println("Square of the numbers");
//		System.out.println(operateOnData((n) -> n*n, 50));
//		System.out.println(operateOnData((n) -> n*n, 25));
//		
//		System.out.println("Division by 10");
//		System.out.println(operateOnData((n) -> n/10, 1000));
//		
//		System.out.println("Trimming the String from 4 to lastword");
//		Function<String> substring = (str) -> str.substring(4);
//		System.out.println(substring.apply("Java is an 00 Language"));
//		
//		System.out.println("Employee Data");
//		Function<Employee> Incrementedsal =
//				(emp) -> new Employee(emp.getEmpid(),emp.getName(),emp.getSalary()+5000,emp.getSkills());
//				
//				TreeSet<String> skills1=new TreeSet<>();
//				skills1.add("java");
//				skills1.add("python");
//				Employee e = Incrementedsal.apply(new Employee(123, "rrr", 50000, skills1));
//				System.out.println(e);
//	
	
				String [] greetings = {"hi", "hello", "good morning", "good evening"};
				List<String> lst= Arrays.asList(greetings);
				
				List<String> upper = operateOnData((s) -> s.toUpperCase(),lst);
				System.out.println(upper);
				
				Integer [] arr = {123,59, 100, 55, 234, 125, 200, 40, 56};
				List<Integer> mylist= Arrays.asList(arr);
				
				List<Integer> cubes= operateOnData((n) -> n*n*n, mylist);
				System.out.println(cubes);
	
	}
}
