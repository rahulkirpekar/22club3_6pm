package collectiontopic.listtopic;

public class Student 
{
	int rno;
	String name;
	int std;
	
	public Student() 
	{
	}
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	@Override
	public String toString() 
	{
		return rno+" " + name+" " + std;
	}
}
