package stringmanip.immutable;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		String name1 = "royal";
		String name2 = "techno";
		
		System.out.println("Name1: " + name1);// royal
		System.out.println("Name2: " + name2);// techno

		// immutable
		name1 = name1.concat(name2);// royaltechno
		
		System.out.println("Name1: " + name1);//royal 
		System.out.println("Name2: " + name2);//techno
		
		name1.reverse();
	}
}
