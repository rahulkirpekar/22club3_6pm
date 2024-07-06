package collectiontopic.sortingtech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student(1, "rahul", 12, 100);
		Student s2 = new Student(2, "ankur", 10, 90);
		Student s3 = new Student(3, "sagar", 11, 80);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			s.disp();
		}
		Collections.sort(list);
		System.out.println("After Sorting : ");
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			s.disp();
		}
		
	}
}
