package innnerclasstopic.mi;

public class A 
{
	private int value = 100;
	
	// Member Innerclass
	class B
	{
		void disp() 
		{
			System.out.println("Value : " + value);
		}
	}
	
	public static void main(String[] args) 
	{
		A objA = new A();
		
		A.B objB = objA.new B();
		
		objB.disp();
	}
}
