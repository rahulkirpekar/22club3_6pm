package oops.inhtopic;

public class C extends A
{
	int no3;
	public static void main(String[] args) 
	{
		C obj = new C();
		
		obj.no1=10;
		obj.no3=30;
		
		
		System.out.println("obj.no1 : " + obj.no1);
		System.out.println("obj.no2 : " + obj.no2);
		System.out.println("obj.no3 : " + obj.no3);
		
	}
}
