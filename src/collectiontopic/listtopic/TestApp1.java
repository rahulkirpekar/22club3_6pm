package collectiontopic.listtopic;

import java.util.ArrayList;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(10);// 0 
		list.add(true);// 1
		list.add(10.42);//2
		list.add(24445.45f);//3
		list.add(244L);//4
		list.add("royal");//5
		list.add('a');//6
		list.add("royal");//7
		
		Student s= new Student(1, "rahul", 12);
		
		list.add(s);//8

		System.out.println("list.size() : " + list.size());
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println("list.get("+i+") : " + list.get(i));
		}
	}
}
