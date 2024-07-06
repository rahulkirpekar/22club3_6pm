package collectiontopic.listtopic.task1;

import java.util.ArrayList;
import java.util.Scanner;

// Employee Management Application
public class TestApp1 
{
	public static void main(String[] args) 
	{
		int choice = 0 ;
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> list = new ArrayList<Employee>() ;
		int i=0,id = 0;
		boolean flag = false;
		do 
		{
			System.out.println("Enter below choice : ");
			System.out.println("1) add---insert---list                                      ");
			System.out.println("2) update---search--record--list---set(index,object);       ");
			System.out.println("3) delete---search--list---remove(index);                   ");
			System.out.println("4) display all records---records                            ");
			System.out.println("5) search---searching value                                 ");
			System.out.println("6) exit application											");
			choice = sc.nextInt();

			switch(choice) 
			{
				case 1: Employee e= new Employee();
						e.scan();
						list.add(e);
						System.out.println("Employee record Successfully inserted...!!!");
						break;
						
				case 2: System.out.println("Enter Employee Id which you want to Update  : ");
						id = sc.nextInt();
						i = 0;
						flag = false;
						Employee e1 = null;
						for (; i < list.size(); i++) 
						{
							e1 = list.get(i);
							
							if (e1.getId() == id) 
							{
								flag = true;
								break;// i - 2	
							} 
						}
						if(flag) 
						{
							e1.update();
							
							list.set(i, e1);
							
							System.out.println("Employee object successfully Updated from record : " + i);
						}else 
						{
							System.out.println("Given id is not found in records"); 
						}
						break;
						
				case 3: System.out.println("Enter Employee Id which you want to remove : ");
						id = sc.nextInt();

						i = 0;
						flag = false;
						for (; i < list.size(); i++) 
						{
							e1 = list.get(i);
							
							if (e1.getId() == id) 
							{
								flag = true;
								break;// i - 2	
							} 
						}
						if(flag) 
						{
							list.remove(i);
							System.out.println("Employee object successfully removed from record : " + i);
						}else 
						{
							System.out.println("Given id is not found in records"); 
						}
						break;
				case 4: 
						for (i = 0; i < list.size(); i++) 
						{
							e1 = list.get(i);
							e1.disp();
						}
						break;
						
				case 5:
						System.out.println("Enter Id which you want to search : ");
						int searchId = sc.nextInt();
						
						i = 0;
						flag = true;
						for (; i < list.size(); i++) 
						{
							e1 = list.get(i);
							
							if (e1.getId() == searchId) 
							{
								flag = false;
								e1.disp();
								break;// i - 2	
							} 
						}
						if(flag) 
						{
							System.out.println("Given id is not found in records"); 
						}
						
						break;
						
				case 6: System.out.println("Your system will be shutdown");
						try 
						{
							Thread.sleep(1000);
						} catch (InterruptedException ex) 
						{
							ex.printStackTrace();
						}
						System.exit(0);
						break;
			}
		}while(choice != 6);
	}
}