import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        TriangleLogic triangle = new TriangleLogic();

        boolean desire = false;
        do {
            try {
                Scanner scan = new Scanner(System.in);

                System.out.println("Enter the degrees values of two corners of a triangle to check for the existence of such a triangle");
                System.out.print("a = ");
                int a = scan.nextInt();
                System.out.print("b = ");
                int b = scan.nextInt();

                triangle.isTriangle(a, b);
            } catch (InputMismatchException e) {
                System.out.println("Invalid data");
            }

            Scanner scanText = new Scanner(System.in);

            System.out.println("Do u wanna to try again?");
            String answer = scanText.nextLine();

            desire = triangle.whatEnd(answer);
        } while (desire);
    }
}
