package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValueOfExpression {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int a, b, c;
			double z;

			System.out.println("Enter values of a,b,c");

			System.out.println("a = ");
			a = scan.nextInt();
			System.out.println("b = ");
			b = scan.nextInt();
			System.out.println("c = ");
			c = scan.nextInt();

			z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			System.out.println("z = " + z);
		} catch (InputMismatchException e) {
			System.out.println("U should enter numbers");
		}
	}

}
