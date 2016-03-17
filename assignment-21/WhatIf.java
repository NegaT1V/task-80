import java.util.Random;

public class WhatIf
{
	public static void main ( String[] args)
	{
		Random randNumber = new Random();
		int people = randNumber.nextInt(100);
		int cats  = randNumber.nextInt(100);
		int dogs = randNumber.nextInt(100);
		
		System.out.println("people=" + people + "; cats=" +cats + "; dogs=" +dogs);

		if ( people < cats )
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}
