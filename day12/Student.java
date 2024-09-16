package day12;
public class Student {
    private int rollno;
    private String name;

    // Default constructor
    public Student() {
        this.rollno = 1;
        this.name = "aaa";
    }

    // Constructor with rollno and name
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    
    public void simpleMethod()
    {
    	System.out.println("this is simple method");
    }
    public static void staticMethod()
    {
    	System.out.println("this is static method");
    }
    public void methodWithParam(int rollno, String name)
    {
    	System.out.println("roll no ="+rollno+"name: "+name);
    }
    private void privateMethod()
    {
    	System.out.println("This is private method");
    }
    @CreatedBy(name="amruta", priority =2)

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
    
}
