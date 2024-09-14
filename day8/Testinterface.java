package day8;

public class Testinterface {

	public static void main(String[] args) {
		Numberfilter ispositive = (n) -> n>0;
		
		boolean result = ispositive.test(-12);
		System.out.println(result);
		
		Numberfilter isprime = (n) ->
		{
			for(int i=2; i<n;i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		};
		result = isprime.test(11);
		System.out.println(result);
	}

}
