package day10;

public class MyQueue {
	
	int val=0;
	boolean hasvalue = false;
	
	public synchronized void setValue(int val)
	{
		if(hasvalue)
		{
			try {
				wait(0);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.val=val;
		System.out.println("Set value : "+ val);
		hasvalue=true;
		notify();
	}
	
	public synchronized void getValue()
	{
		if(!hasvalue)
		{
			try {
				wait();
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
//		this.val=val;
		System.out.println("Got value : "+ val);
		hasvalue=false;
		notify();
	}

}
