package diff;

import java.util.regex.Pattern;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		System.out.println(Pattern.matches("[a-z]", "g"));
		 
        System.out.println(Pattern.matches("[a-zA-Z]", "Gfg"));
	}
}
