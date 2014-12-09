//Justin Himmighoefer
//User enters an integar and is given the factorial value.
//Factorial value is the product of all positive integars less than or equal to n

import java.util.*;

public class Fact
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		long n;
		System.out.println("Please enter an int: ");
		n = keyboard.nextLong();
		System.out.println("Factorial of " + n + " is: " + factorial(n));
	}//end main
	
	public static long factorial(long nPassed)
	{
		System.out.println("Factorial called, passed: " + nPassed);
		if(nPassed == 0)
		{
			System.out.println("Reutrning 1");
			return 1;
		}//end if
		else
		{
			System.out.println("Factorial called in else, passed: " + (nPassed - 1));
			return nPassed * factorial(nPassed - 1);
		}
	}//end factorial
}//end class
