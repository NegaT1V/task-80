
import java.util.Scanner;

public class HowOldAreYou
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String name;
		int age;

		System.out.print("Hey, what's your name? ");
		name = keyboard.nextLine();

		System.out.print("Ok, " + name + ", how old are you? ");
		age = keyboard.nextInt();

		if (age <= 16){
			System.out.println("You can't drive. " + name);
		}
		else 
		{
			if (age <= 18)
			{
				System.out.println("You can't vote. "  + name);
			}
			else
			{
				if (age <= 25)
				{
					System.out.println("You can't rent car. "  + name);
			    }
			    else 
			    {
					System.out.println("You can do anything that's legal. "  + name);
			    }
			}
		}
	}
}