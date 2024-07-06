package collectiontopic.settopic;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// not maintain insertion order
//		HashSet<String> setObj = new HashSet<String>(); // Hashing algo
		
//		LinkedHashSet<String> setObj = new LinkedHashSet<String>(); // maintaiin insertion order 
		
		TreeSet<String> setObj = new TreeSet<String>(); // Sorting
		
		setObj.add("ramesh");
		setObj.add("sagar");
		setObj.add("kunal");
		setObj.add("amar"); 
		setObj.add("brijesh");
		setObj.add("ramesh");
		setObj.add("sagar");
		
		
		Iterator<String> itr =	setObj.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			
			System.out.println(name);
		}
		
		//     HashSet          LinkedHashSet		TreeSet
		//	(NotMainTain		MainTain 			Sorting 	
		//   Insertion Order)   Insertion Order)	
		//-------------------   ---------------    ---------------
		//		amar           ramesh				amar
		//		kunal          sagar                brijesh
		//		sagar          kunal                kunal
		//		brijesh        amar                 ramesh
		//		ramesh         brijesh              sagar
		
	}
}
