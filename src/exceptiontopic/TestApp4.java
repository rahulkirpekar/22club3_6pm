package exceptiontopic;

import java.util.Scanner;

public class TestApp4 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// <18 ---raise exception ---1) CE   2) UCE
//			1) CE   
			throw new InvalidAgeException("\n\"Invalid Age,\n\tPlease enter valid age for Vote\"");
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
	}
}
