package oops.polymorphism.cp;

public class TestApp1 
{
	void addFun()
	{
		
	}
	void addFun(float no1,float no2)
	{
		System.out.println("two float args---addFun(float no1,float no2)");
	}
	void addFun(double no1,double no2)
	{
		System.out.println("two double args---addFun(double no1,double no2)");
	}
	void addFun(int no1,int no2,int no3)
	{
		
		
	}
	public static void main(String[] args)
	{
		TestApp1 obj = new TestApp1();
		
		obj.addFun('a','z');
		
	}
}
// 1) arg count
// 2) exact data type match
// 3) type pramotion rule





