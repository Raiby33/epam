import java.util.InputMismatchException;
import java.util.Scanner;

public class ValueOfFunc {
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

			z = ((a - 3) * b / 2) + c;
			System.out.println("z = " + z);	
		} catch (InputMismatchException e) {
			System.out.println("U should enter numbers");
		}
	}
}
