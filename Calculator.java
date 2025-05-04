import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pehla number input karo
        System.out.print("Pehla number daalein: ");
        double result = sc.nextDouble();

        char continueChoice;

        do {
            // Operator choose karo
            System.out.print("Aapka operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            // Dusra number input karo
            System.out.print("Dusra number daalein: ");
            double nextNumber = sc.nextDouble();

            // Calculation based on operator
            if (operator == '+') {
                result += nextNumber;
            } else if (operator == '-') {
                result -= nextNumber;
            } else if (operator == '*') {
                result *= nextNumber;
            } else if (operator == '/') {
                if (nextNumber != 0) {
                    result /= nextNumber;
                } else {
                    System.out.println("Error: Zero se divide nahi kar sakte.");
                    return; // if division by zero program exits
                }
            } else {
                System.out.println("Galat operator! Kripya sahi operator use karein.");
                return; // Exit if invalid operator is entered
            }

             System.out.println("Abhi ka result: " + result);

            // Continue karna hai ya nahi
            System.out.print("Aur calculate karna hai? (y/n): ");
            continueChoice = sc.next().charAt(0);

        } while (continueChoice == 'y' || continueChoice == 'Y'); 

        System.out.println("Final result: " + result);
        sc.close();
    }
}
