package day10;

public class Thread2 implements Runnable{

	

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread two :" + i);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}}
		
	}
	
}
