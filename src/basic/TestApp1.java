package basic;// optional
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		// System.in---console
		Scanner sc = new Scanner(System.in);
		
		float no1,no2,ans;
		
		System.out.println("Enter No1 :");
		no1 = sc.nextFloat();
		System.out.println("Enter No2 :");
		no2 = sc.nextFloat();
		
		ans = no1+no2;
		
		System.out.println("Addition : " + ans);
	}
}