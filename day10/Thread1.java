package day10;

public class Thread1 extends Thread {
	String name;
	public Thread1(String name)
	{
		this.name = name;
	}
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				//Causes currently executing thread to
				//pause and allow other thread to execute
				Thread.yield();
			}
			else {
			System.out.println(name +" :" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}}
		}
	}

}
