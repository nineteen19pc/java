package day7;

public class DemoStat {
	
	public static void main(String [] args)
	{
		Double [] sal = {5000.0, 450000.0, 35000.0, 350000.0, 800000.0 };
		Stat<Double> stat =new Stat<>();
		stat.setArray(sal);
		System.out.println("Average salary : "+ stat.calculateAverage());
		
		Integer age []= {18, 22, 30, 25, 19, 20};
		Stat<Integer> stat1=new Stat<>();
		stat1.setArray(age);
		System.out.println("Average age: "+stat1.calculateAverage());
	}

}
