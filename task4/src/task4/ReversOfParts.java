package task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReversOfParts {
	
	public static final int THOUSAND_FOR_REVERS = 1000;

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double realnumber, reversnumber;
			
			System.out.println("Enter a real number of the form \"nnn.ddd\" ");
			realnumber = scan.nextDouble();
			
			reversnumber = (realnumber * THOUSAND_FOR_REVERS) % THOUSAND_FOR_REVERS + (int) realnumber / 1000.0;
			System.out.println("Entered number = " + realnumber + ", Reversed number = " + reversnumber);
		}catch(InputMismatchException e){
			System.out.print("U should enter a number");
		}
	}

}
