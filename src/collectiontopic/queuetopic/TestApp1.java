package collectiontopic.queuetopic;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queueObj = new PriorityQueue<>();
		
		queueObj.add("ramesh");
		queueObj.add("sagar");
		queueObj.add("kunal");
		queueObj.add("amar"); 
		queueObj.add("brijesh");
		queueObj.add("ramesh");
		queueObj.add("sagar");

		
		while(!queueObj.isEmpty()) 
		{
			System.out.println(queueObj.poll());
		}
	}
}
