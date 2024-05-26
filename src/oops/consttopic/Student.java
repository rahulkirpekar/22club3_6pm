package oops.consttopic;
public class Student 
{
	// Data Members
	int rno;//0
	String name;//null
	int std;//0

	// 1) Default Constructor
	public Student() 
	{
		System.out.println("START ::  Default Constructor");
		System.out.println(rno + "  " + name + " " +std);
		rno=1;
		name="rahul";
		std=12;
		System.out.println(rno + "  " + name + " " +std);
		System.out.println("EXIT ::  Default Constructor");
	}
	// 2) Parameterized Constructor--Two args
	public Student(int rno,String name) 
	{
		System.out.println("START :: TWO- PARA Constructor");
		System.out.println(rno + "  " + name + " " +std);
		this.rno = rno;
		this.name = name;
		System.out.println("EXIT :: TWO-PARA Constructor");
	}
	// 2) Parameterized Constructor--Three args
	public Student(int rno,String name,int std) 
	{
		System.out.println("START :: THREE-- PARA Constructor");
		System.out.println(rno + "  " + name + " " +std);
		this.rno = rno;
		this.name = name;
		this.std = std;
		System.out.println("EXIT ::  THREE--PARA Constructor");
	}
	// 3) Copy Constructor
	public Student(Student s) 
	{
		System.out.println("START :: Copy Constructor");
		rno=s.rno;
		name=s.name;
		std=s.std;
		System.out.println("EXIT :: Copy Constructor");
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "Kunal",12);
		Student s2 = new Student(s1);
		
		System.out.println(s1.rno + "  " + s1.name + " " +s1.std);
		System.out.println(s2.rno + "  " + s2.name + " " +s2.std);
	}
}