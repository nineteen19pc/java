package day10;

public class Counter {
	
	int count=0;
	public synchronized void increment()
	{
		count++;
	}
	public synchronized int getCount()
	{
		return count;
	}

}
