package stringmanip.mutable;

public class TestApp1 
{
	
	public static void main(String[] args) 
	{

		StringBuffer name1 = new StringBuffer("royal");
		StringBuffer name2 = new StringBuffer("techno");
		
		System.out.println("Name1: " + name1);// royal
		System.out.println("Name2: " + name2);// techno

		// mutable
		name1.append(name2);// name1--->royaltechno
		
		System.out.println("Name1: " + name1);//royaltechno	 
		System.out.println("Name2: " + name2);//techno
	
		name1.reverse();
	}

}
/*
1) Immutable				2) Mutable
-------------				-------------
String					StringBuffer(Threadsafe---Thread)
					StringBuilder

concate-------------------------------->append()
       --------------------------------->reverse()


*/