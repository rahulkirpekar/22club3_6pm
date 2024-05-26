package stringmanip.immutable;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		// String----OtherType--convert

		String value1 = String.valueOf(10) ;
		String value2 = String.valueOf(20) ;
		System.out.println(value1 + value2);
		
		// primitive------class(Wrapper class)
		// boolean --Boolean
		// byte------Byte
		// short--Short
		// long---Long
		// int---Integer
		// char---Character
		// double---Double
		
		int no1 = Integer.parseInt(value1);
		int no2 = Integer.parseInt(value2);		

		System.out.println("(no1+no2) : " + (no1+no2));
//	-------------othertype value---->String---valueOf		
//		int no1 =100;
//		int no2 =200;
//		String value1 = String.valueOf(no1) ;
//		String value2 = String.valueOf(no2) ;
//		System.out.println(value1 + value2);
	}
}
