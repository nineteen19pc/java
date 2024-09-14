package day11;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import day7.Employee;
import day7.EmployeeCollection;

public class EmployeeDataFile {
	public static void main(String[] args) {
		File f=new File("employee.ser");
		EmployeeCollection c= new EmployeeCollection();
		List<Employee> emplist=c.initializeEmployeeData();
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f))){
			for(Employee e: emplist)
			{
				out.writeObject(e);
			}
		}catch (IOException e){
			System.out.println(e);;
		}
		try(FileInputStream fin= new FileInputStream(f);
				ObjectInputStream in=new ObjectInputStream(fin)){
			while(fin.available()!=0)
			{
				Employee e= (Employee)in.readObject();
				System.out.println(e);
			}
		}catch (IOException e){
			System.out.println(e);
		}
		catch (ClassNotFoundException e){
			System.out.println(e);;
		}
	}

}
