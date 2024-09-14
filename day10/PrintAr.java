package day10;

public class PrintAr implements Runnable{
	
	
	ArraySink a= new ArraySink();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			display(a);
		}
	}
	private synchronized void display(ArraySink a2) {
		System.out.println(Thread.currentThread().getName() + " is Printing Array ");
		
		
		try {
			Thread.sleep(500);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.display();
		
	}
	
	

}
