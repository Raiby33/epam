public class TriangleLogic {

    static final int MAX_VALUE = 180;
    static final int VALUE_OF_RIGHT_CORNER = 90;

    public void isTriangle(int a, int b) {
        if ((a > 0) && (b > 0)) {
            if (a + b < MAX_VALUE) {
                System.out.println("Such the triangle can exist");
                if ((MAX_VALUE - (a + b) == VALUE_OF_RIGHT_CORNER) || (b == VALUE_OF_RIGHT_CORNER) || (a == VALUE_OF_RIGHT_CORNER)) {
                    System.out.println("This is the right triangle");
                } else System.out.println("This isn't the right triangle ");
            } else System.out.println("Such the triangle cannot exist");
        } else System.out.println("Invalid values of corners(negative)");
    }

    public boolean whatEnd(String answer) {
        boolean desire = switch (answer.toLowerCase()){
            case "No","Nope" -> false;
            default -> true;
        };
        return desire;
    }
}

