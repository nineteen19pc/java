package day7;

public class Stat <T extends Number>{ // bounded types
	
	T [] arr;
	
	public void setArray( T [] arr)
	{
		this.arr=arr;
	}
	public double calculateAverage()
	{
		double sum =0.0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i].doubleValue();
		}
		return sum/arr.length;
	}
}
