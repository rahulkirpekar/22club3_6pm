package collectiontopic.sortingtech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);

		System.out.println("list : " + list);

		Collections.sort(list);
		
		System.out.println("list : " + list);
	}
}

// list --- sorting

	// list--int values
	//  Collections.sort(list);// primitive type



// set --- sorting(Treeset)
// queue --- sorting(PriorityQueue)
// Map ---(TreeMap)
