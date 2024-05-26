package oops.encaptopic;
// Pure encapsulation ---> Data Security
public class Student 
{
	private int rno;
	private String name;
	private int std;
	// getter and setters
	//setters / Mutators
	public void setRno(int rno) 
	{
		this.rno=rno;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setStd(int std) 
	{
		this.std=std;
	}
	// getters // Accessors
	public int getRno() 
	{
		return rno;
	}
	public String getName() 
	{
		return name;
	}
	public int getStd() 
	{
		return std;
	}
}