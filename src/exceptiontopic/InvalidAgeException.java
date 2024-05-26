package exceptiontopic;
//UN-Checked Exception -- Custom Exception---[UN-CHECKED Exception]

//public class InvalidAgeException extends RuntimeException
// Checked Exception -- Custom Exception---[CHECKED Exception]
public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
