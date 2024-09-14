package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class EmployeePortal {
	public static void main(String[] args) {
		EmployeeCollection e=new EmployeeCollection();
		List <Employee> emplist=e.initializeEmployeeData();
		// print search sort filter
		e.printEmployeeData(emplist);
		
		System.out.println("Searching Employee");
		Employee found = e.getEmployee(emplist, 434);
		System.out.println("Data : "+ found);
		
		List <Employee> emps=new ArrayList<>();
		TreeSet<String> skills1=new TreeSet<>();
		skills1.add("java");
		skills1.add("python");
		Employee e1= new Employee(343, "rrr", 7500,"IT", skills1);
		
		e.addEmployee(emplist, e1);
		e.printEmployeeData(emplist); 
		
		System.out.println("Sorting by Employee id");
		Collections.sort(emplist);
		e.printEmployeeData(emplist);
		int index = Collections.binarySearch(emplist, new Employee(343, null, 0,null, null));
		System.out.println("Found at index : "+ index);
		
		System.out.println("Sorting by Employee name");
		Collections.sort(emplist, new NameComparator());
		e.printEmployeeData(emplist);
		index = Collections.binarySearch(emplist, new Employee(0, "sss", 0,null, null));
		System.out.println("Found at index : "+ index);
		
		System.out.println("Sorting by Salary");
		Collections.sort(emplist, new SalaryComparator());
		e.printEmployeeData(emplist);
		
		System.out.println("Filter By java skill");
		ArrayList<Employee> filtered= e.filterList(emplist, "java");
		e.printEmployeeData(filtered);
	}

}
