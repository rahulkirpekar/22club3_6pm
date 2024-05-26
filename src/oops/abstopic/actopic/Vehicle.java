package oops.abstopic.actopic;

public abstract class Vehicle 
{
	// 1) Dm's
	int no;
	// 2) Constructors 
	public Vehicle() 
	{
		no=10;
	}
	// 3) Methods
//		--->Abstract method
	public abstract void getSpec(); 

//		--->Non-Abstract method
	public void test1() 
	{
		
	} 
}
