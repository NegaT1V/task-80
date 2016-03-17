/*Please enter the following information so I can sell it for a profit!

First name: Helena
Last name: Bonham-Carter
Grade (9-12): 12
Student ID: 453916
Login: bonham_453916
GPA (0.0-4.0): 3.73

Your information:
	Login: bonham_453916 
	ID:    453916 
	Name:  Bonham-Carter, Helena 
	GPA:   3.73 
	Grade: 12
*/

import java.util.Scanner;

public class  MoreUserInput 
{

	public static void main( String[] args )
	{
	Scanner keyboard = new Scanner(System.in);
	
	String firstname, lastname, login;
	byte grade;
	int studentID;
	double gpa;

	System.out.println( "Please enter the following information so I can sell it for a profit!\n" );

    System.out.print( "First name: ");
	firstname = keyboard.nextLine();

	System.out.print( "Last name: ");
	lastname = keyboard.nextLine();

    while(boolean i)
	System.out.print( "Grade (9-12): ");
	grade = keyboard.nextByte();

	System.out.print( "Student ID: ");
	studentID = keyboard.nextInt();

	System.out.print( "Login: ");
	login = keyboard.nextLine();

	System.out.print( "GPA (0.0-4.0): ");
	gpa = keyboard.nextDouble();

	System.out.println( "\tLogin:  " + login);
	System.out.println( "\tID:     " + studentID);
	System.out.println( "\tName:   " + lastname + ", " + firstname);
	System.out.println( "\tGPA:    " + gpa);
	System.out.println( "\tGrade:  " + grade);
	}
}