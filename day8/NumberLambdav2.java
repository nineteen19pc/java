package day8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberLambdav2 {
	
	public static boolean operateOnNumber (Numberfilter filter, int n)
	{
		return filter.test(n);
	}
	public static ArrayList<Integer> operateOnNumber (Numberfilter filter, List<Integer>lst)
	{ 
		ArrayList<Integer> filtered = new ArrayList<>();
		for(Integer n : lst)
		{	
			if(filter.test(n))
			{
			filtered.add(n);
			}
		}
		return filtered;
	}
	
		public static boolean isPrime(int n)
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					return false;
				}
				
			}return true;
		}
	
	public static void main(String[] args) {
		
		boolean result= operateOnNumber(NumberLambdav2 :: isPrime,11);
		System.out.println(result);
		
		boolean ismultiple = operateOnNumber((n) -> n%5==0, 100);
				System.out.println(ismultiple);
				Integer [] arr = {123,59, 100, 55, 23, 125, 200, 47, 56};
				List<Integer> mylist = Arrays.asList(arr);
				List<Integer> multiplesoffive = operateOnNumber((n) -> n%5==0, mylist);
				System.out.println(multiplesoffive);
				
//				Integer [] arr = {123,56, 100, 55, 234, 125, 200, 40, 56};
				
				List<Integer> primes = operateOnNumber((n) -> 
				{
					for(int i=2;i<n;i++)
					{
						if(n%i ==0)
							return false;
					}return true;
				},mylist);
				System.out.println(primes);
				
				
				
				
				
	}
	}