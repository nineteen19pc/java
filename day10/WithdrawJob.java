package day10;

public class WithdrawJob implements Runnable {
	Account acc= new Account(10000);
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			withdraw(2000);
		}
	}
		public synchronized void withdraw(int amount)
		{
			if (acc.getBalance()>=amount)
			{
				System.out.println(Thread.currentThread().getName() + " is ready Withdraw ");
				System.out.println(Thread.currentThread().getName() + " is going Withdraw ");
				try {
					Thread.sleep(500);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " wakes up and Withdraws ");
				acc.withdraw(amount);
				System.out.println(Thread.currentThread().getName() + " Withdraw successfully ");
				System.out.println("Balance: " + acc.getBalance());
			}
			else
			{
				System.out.println(Thread.currentThread().getName() + " doesnt have enough Money");
			}
		}}
	

