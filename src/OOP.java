import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        OOP.word();
        OOP.number();
        System.out.println(" ");
        //String name = GuessingGame.name();
        //System.out.println(name);
        final double pi = 3.141592653579;
        System.out.println(OOP.sumOfNumbers(4,1324));
        System.out.println(OOP.productOfNumbers(5,5, pi));
        //System.out.println(GuessingGame.solveLinearSlopeWithTwoCords());

    }

    public static void word() {
        System.out.println("Hello World");
        System.out.println("Hello George");

    }

    public static void number() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if(i == 100) {
                break;
            }
            System.out.print(", ");
        }

    }

    public static String name() {
        Scanner userInputScanner = new Scanner(System.in);
        String newName;
        System.out.print("Enter Your Name: ");
        newName = userInputScanner.nextLine();
        return "Hi "+newName+", nice to meet you.";
    }

    public static int sumOfNumbers(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static double productOfNumbers(double one, double two, double three) {
        return one * two * three;

    }

    public static double solveForY(double m, double x, double b) {
        double y = m * x + b;
        return y;
    }

    public static double solveLinearSlopeWithTwoCords() {
        Scanner userInputScanner = new Scanner(System.in);
        double yOne = 0;
        double yTwo = 0;
        double xOne = 0;
        double xTwo = 0;
        System.out.print("Enter y1: ");
        yOne = userInputScanner.nextDouble();
        System.out.print("Enter x1: ");
        xOne = userInputScanner.nextDouble();
        System.out.print("Enter y2: ");
        yTwo = userInputScanner.nextDouble();
        System.out.print("Enter x2: ");
        xTwo = userInputScanner.nextDouble();
        double slope = (yTwo - yOne)/(xTwo - xOne);
        return slope;
    }


}

