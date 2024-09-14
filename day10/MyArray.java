package day10;

public class MyArray {
	int [] arr;

	public MyArray(int[] arr) {
		super();
		this.arr = arr;
	}
	
	public synchronized void print()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
