package iotopic.seritopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\22club3_6pm\\sturcd.txt");

		ObjectInputStream oin = new ObjectInputStream(fin);
		
		Student s1 = (Student)oin.readObject();
		
		
		System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
		
	}
}
