package day10;

public class ArrayCon {
	public static void main(String[] args) {
		PrintAr p=new PrintAr();
		Thread t1= new Thread(p);
		Thread t2= new Thread(p);
		
		t1.setName("User 1");
		t2.setName("User 2");
		
		t1.start();
		t2.start();
	}

}
