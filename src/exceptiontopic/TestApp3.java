package exceptiontopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		try 
		{
			a[4] = 10;
			
		}finally 
		{
			System.out.println("Finally Block");
		}
		System.out.println("General Statements");
	}
}
