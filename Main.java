import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = readNumber("a = ");
        double b = readNumber("b = ");
        double c = readNumber("c = ");
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
}
