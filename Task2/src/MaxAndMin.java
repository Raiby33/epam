import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        boolean desire = false;
        Logic logic = new Logic();
        do {
            try {
                Scanner scan = new Scanner(System.in);

                System.out.println("Enter values of a,b,c,d for found expression value (max{min(a, b), min(c, d)} ");
                System.out.print("a = ");
                int a = scan.nextInt();
                System.out.print("b = ");
                int b = scan.nextInt();
                System.out.print("c = ");
                int c = scan.nextInt();
                System.out.print("d = ");
                int d = scan.nextInt();

                System.out.println("max{min(" + a + ", " + b + "), min(" + c + ", " + d + ")} = " + logic.maxValue(logic.minValue(a, b), logic.minValue(c, d)));
            } catch (InputMismatchException e) {
                System.out.println("Invalid data");
            }
            Scanner scanText = new Scanner(System.in);

            System.out.println("Do u wanna to try again?");
            String answer = scanText.nextLine();

            desire = logic.whatEnd(answer);
        } while (desire);
    }
}
