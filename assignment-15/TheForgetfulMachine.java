

import java.util.Scanner;

public class TheForgetfulMachine
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Give me a word! \n" );
		keyboard.next();

		System.out.print( "Give me a second word! \n" );
		keyboard.next();

		System.out.print( "\nGreat, now your favorite number? \n" );
		keyboard.next();

		System.out.print( "And your second-favorite number... \n" );
		keyboard.next();

		System.out.println( "\n Whew!  Wasn't that fun?" );
	}
}