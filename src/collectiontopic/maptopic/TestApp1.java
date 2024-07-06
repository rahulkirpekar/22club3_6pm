package collectiontopic.maptopic;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		HashMap<Integer, String> map = new HashMap<>();// Not Maintain Insertion Order
//		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();// Maintain Insertion Order
		TreeMap<Integer, String> map = new TreeMap<>();// Sorting
		
		map.put(3, "rakesh");
		map.put(1, "rahul");// Entry--[KEY,VALUE]
		map.put(5, "neel");
		map.put(2, "ankur");
		map.put(4, "kunal");

		for(Map.Entry<Integer,String> e : map.entrySet()) 
		{
			System.out.println(e.getKey()+" " + e.getValue());
		}
	}
}
