package collectiontopic.listtopic;

import java.util.Iterator;
import java.util.Vector;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();

		v.add("rahul");
		v.add(10);
		v.add(324L);
		v.add('r');
		v.add(12.21);
		v.add(54.54f);
		v.add(new Student(1, "Tej", 12));
		
		Iterator itr = v.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
	}
}
