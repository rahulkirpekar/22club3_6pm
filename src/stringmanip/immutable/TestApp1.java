package stringmanip.immutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		1) By String literls[HEAP---"SCP"---]:-
//	-------------------------------------------------
		String name1 = "royal";
		String name2 = "royal";
		String name3 = "techno";
		String name4 = name1 + name3;

		System.out.println("(name1==name2) : " + (name1==name2));//true
		System.out.println("(name1==name3) : " + (name1==name3));//false
		System.out.println("(name1==name4) : " + (name1==name4));//false
		
		System.out.println("(name1.equals(name2)) : " + (name1.equals(name2)));//true
		System.out.println("(name1.equals(name3)) : " + (name1.equals(name3)));//false
		System.out.println("(name1.equals(name4)) : " + (name1.equals(name4)));// false
		
		String name5 = new String("rahul");
		String name6 = new String("rahul");
		String name7 = new String("sagar");

		System.out.println("(name5==name6) : " + (name5==name6));//false
		System.out.println("(name5==name7) : " + (name5==name7));//false
	}
}
