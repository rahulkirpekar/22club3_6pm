package innnerclasstopic.ni;

public class A 
{
	public static int no = 1000;
	
	// Nested Innerclass
	static class B 
	{
		void disp() 
		{
			System.out.println("No : " + no);
		}
	}

	public static void main(String[] args) 
	{
		A.B obj = new A.B();
		
		obj.disp();
	}
}
