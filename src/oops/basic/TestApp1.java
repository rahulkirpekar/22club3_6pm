package oops.basic;

public class TestApp1 
{
	public static void main(String[] args)
	{
		Student s[] = new Student[5];
		
		// s - reference variable(pointer variable)
		// Student - object
		System.out.println("s array object   : " + s);
		
		for (int i = 0; i < s.length; i++) 
		{
//			s[i] = new Student();
			s[i].scanData();
		}
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
	}
}