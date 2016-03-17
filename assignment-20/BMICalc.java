import java.util.Scanner;

public class BMICalc

{

        public static void main( String[] args )

        {

                Scanner keyboard = new Scanner(System.in);

                double height, weight;
                
                System.out.print("Your height in m: ");
                height = keyboard.nextDouble();

                System.out.print("Your weight in kg: ");
                weight = keyboard.nextDouble();

                System.out.println("Your BMI is " + (weight/(height*height)));

        }
}