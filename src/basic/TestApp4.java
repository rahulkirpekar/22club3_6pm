package basic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];//a[0]..a[4]
		
		System.out.println("a.length : " +  a.length);
		
		for(int i = 0 ; i < a.length ; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < a.length ; i++) 
		{
			System.out.println("A["+ i +"] : " + a[i]);
		}
	}
}
