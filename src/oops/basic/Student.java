package oops.basic;
import java.util.Scanner;
public class Student 
{
	// Class Properties = [1) Dm's + 2) mf's]
	private int rno;
	private String name;
	private int std;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Name : ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno + " " +name + " " + std+"---"+this);
	}
}
