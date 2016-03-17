import java.util.Scanner;

public class  AgeinFiveYears
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String name;
		int year;

		System.out.print("Hello.  What is your name?  ");
		name = keyboard.nextLine();

		System.out.print("Hi, " + name +"!  How old are you?");
		year = keyboard.nextInt();

		System.out.println("Did you know that in five years you will be " + (year + 5) +" years old?");

		System.out.println("And five years ago you were " + (year - 5) +"! Imagine that!");		


	}

}



/*
Hello.  What is your name? Percy_Bysshe_Shelley

Hi, Percy_Bysshe_Shelley!  How old are you? 34

Did you know that in five years you will be 39 years old?
And five years ago you were 29! Imagine that!
*/