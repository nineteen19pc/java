
package day10;

public class DemoPrint {
	public static void main(String[] args) {
		int [] arr= {1 ,32,34,34,35,45,5,653,44};
		MyArray a = new MyArray(arr);
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				a.print();
			}
		});
		
	}

}
