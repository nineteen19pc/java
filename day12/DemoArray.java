package day12;
import java.lang.reflect.Array;

public class DemoArray {
	public static void main(String[] args) {
		String [] greetings = (String [] )Array.newInstance(String.class, 4);
		Array.set(greetings, 0, "hi");
		Array.set(greetings, 1, "Hello");
		Array.set(greetings, 2, "good morning");
		
		for(int i=0;i<3;i++)
		{
			System.out.println(Array.get(greetings, i));
		}
		
	}

}
