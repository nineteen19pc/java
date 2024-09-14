package day7;
import java.util.HashSet;
import java.util.Iterator;

public class DemoSet {
	public static void main(String[] args)
{
	HashSet<String > set =new HashSet<>();
	set.add("one");
	set.add("two");
	set.add("three");
	set.add("four");
	set.add("five");
	
	System.out.println(set);
	
	set.remove("four");
	System.out.println(set);
	set.add("four");
	set.add("five");
	System.out.println("---------------");
	for(String item : set)
	{
		System.out.println(item.toUpperCase());
	}
	System.out.println("---------------");
	
	Iterator<String> it = set.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println(set.contains("four"));
	
}}
