package basic;

import java.util.Scanner;

public class TetsApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// Multiple Lines
					//sc.next();---single word						
		System.out.println("Name : " + name);
	}
}
