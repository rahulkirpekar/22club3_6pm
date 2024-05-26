package exceptiontopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		int no1,no2,ans = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter no2 : ");
		no2 = sc.nextInt();
		
		try 
		{
			try 
			{
				ans = no1/no2;
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				String name = null;
				System.out.println("name.length() : " + name.length());
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				int a[] = new int[5];
				a[5] = 100;
				System.out.println("a[5] : " + a[5]);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			
		} catch (ArithmeticException | NullPointerException e) 
		{
			System.out.println(e + " Handled by catch Block");
			e.printStackTrace();
		}
		catch(Exception e) 
		{
			System.out.println("Exception Handled by catch Block");
			e.printStackTrace();
		}
		System.out.println("Result : "+ans);
	}
}
