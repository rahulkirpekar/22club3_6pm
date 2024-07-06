package collectiontopic.listtopic;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		LinkedList listObj = new LinkedList();

		listObj.add("rahul");
		listObj.add(10);
		listObj.add(324L);
		listObj.add('r');
		listObj.add(12.21);
		listObj.add(54.54f);
		listObj.add(new Student(1, "Tej", 12));
		
		Iterator itr = listObj.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
	}
}
