import java.util.Scanner;

public class NameAgeSalary
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int old;
		double perHour;

		System.out.println( "Hello.  What is your name?" );
		name = keyboard.nextLine();

		System.out.println( "Hi," + name + "!  How old are you?" );
		old = keyboard.nextInt();

		System.out.println( "So you're " + old + "! , eh?  That's not old at all! \n How much do you make, " + name +"?" );
		perHour = keyboard.nextDouble();

		System.out.println(  perHour  + "!  I hope that's per hour and not per year! LOL!" );



	}
}

/*
 
Hello.  What is your name?
Dennis 
 
Hi, Dennis!  How old are you?
37 
 
So you're 37, eh?  That's not old at all!
How much do you make, Dennis?
8.50 
 
8.5!  I hope that's per hour and not per year! LOL!
*/
