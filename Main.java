import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = readNumber("a = ");
        double b = readNumber("b = ");
        double c = readNumber("c = ");
        solveMathEquation(a, b, c);
    }

    private static double readNumber(String title) {
        System.out.print(title);
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Input is not valid real number");
            return readNumber(title);
        }
    }

    private static void solveMathEquation(Double a, Double b, Double c) {
        double D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println("There are 0 roots");
        } else if (D == 0) {
            double x = (-b) / (2 * a);
            System.out.println("There are 1 root:\nx = " + x);
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("There are 2 roots:\nx1 = " + x1 + "\nx2 = " + x2);
        }
    }
}
