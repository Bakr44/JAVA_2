import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static double div(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public static int mod(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot mod by zero");
        }
        return num1 % num2;
    }

    public static int min(int num1, int num2) {
        return Math.min(num1, num2);
    }

    public static int max(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static double avg(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> allResults = new ArrayList<>();
        double lastResult = 0;
        double result;

        System.out.println("please choose:");

        int choice = 0;

        do {
            System.out.println("Enter 1 to addition the numbers\n" +
                    "\n" +
                    "Enter 2 to subtraction the numbers\n" +
                    "\n" +
                    "Enter 3 to multiplication the numbers\n" +
                    "\n" +
                    "Enter 4 to division the numbers\n" +
                    "\n" +
                    "Enter 5 to modulus the numbers\n" +
                    "\n" +
                    "Enter 6 to find minimum number\n" +
                    "\n" +
                    "Enter 7 to find maximum number\n" +
                    "\n" +
                    "Enter 8 to find the average of numbers\n" +
                    "\n" +
                    "Enter 9 to print the last result in calculator\n" +
                    "\n" +
                    "Enter 10 to print the list of all results in calculator\n" +
                    "\n" +
                    "Enter 11 to Exit"
            );

            try {
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("enter first number: ");
                        int num1 = input.nextInt();
                        System.out.println("enter second number: ");
                        int num2 = input.nextInt();
                        result = sum(num1, num2);
                        lastResult = result;
                        allResults.add(result);
                        System.out.println("the sum of " + num1 + " and " + num2 + " is " + result + "\n");
                    }
                    case 2 -> {
                        System.out.println("enter first number: ");
                        int num3 = input.nextInt();
                        System.out.println("enter second number: ");
                        int num4 = input.nextInt();
                        result = sub(num3, num4);
                        lastResult = result;
                        allResults.add(result);
                        System.out.println("the subtract of " + num3 + " and " + num4 + " is " + result + "\n");
                    }
                    case 3 -> {
                        System.out.println("enter first number: ");
                        int num5 = input.nextInt();
                        System.out.println("enter second number: ");
                        int num6 = input.nextInt();
                        result = mul(num5, num6);
                        lastResult = result;
                        allResults.add(result);
                        System.out.println("the multiplay of " + num5 + " and " + num6 + " is " + result + "\n");
                    }
                    case 4 -> {
                        System.out.println("enter first number: ");
                        int num7 = input.nextInt();
                        System.out.println("enter second number: ");
                        int num8 = input.nextInt();
                        try {
                            result = div(num7, num8);
                            lastResult = result;
                            allResults.add(result);
                            System.out.println("the divide of " + num7 + " and " + num8 + " is " + result + "\n");
                        } catch (ArithmeticException ea) {
                            System.out.println(ea.getMessage());
                        }
                    }
                    case 5 -> {
                        System.out.println("enter first number: ");
                        int num9 = input.nextInt();
                        System.out.println("enter second number: ");
                        int num10 = input.nextInt();
                        try {
                            result = mod(num9, num10);
                            lastResult = result;
                            allResults.add(result);
                            System.out.println("the modulus of " + num9 + " and " + num10 + " is " + result + "\n");
                        } catch (ArithmeticException ea) {
                            System.out.println(ea.getMessage());
                        }
                    }
                    case 6 -> {
                        System.out.println("enter first number: ");
                        int num11 = input.nextInt();
                        System.out.println("enter second number: ");
                        int num12 = input.nextInt();
                        result = min(num11, num12);
                        lastResult = result;
                        allResults.add(result);
                        System.out.println("the minimum of " + num11 + " and " + num12 + " is " + result + "\n");
                    }
                    case 7 -> {
                        System.out.println("enter first number: ");
                        int num13 = input.nextInt();
                        System.out.println("enter second number: ");
                        int num14 = input.nextInt();
                        result = max(num13, num14);
                        lastResult = result;
                        allResults.add(result);
                        System.out.println("the maximum of " + num13 + " and " + num14 + " is " + result + "\n");
                    }
                    case 8 -> {
                        System.out.println("enter first number: ");
                        int num15 = input.nextInt();
                        System.out.println("enter second number: ");
                        int num16 = input.nextInt();
                        result = avg(num15, num16);
                        lastResult = result;
                        allResults.add(result);
                        System.out.println("the average of " + num15 + " and " + num16 + " is " + result + "\n");
                    }
                    case 9 -> {
                        System.out.println("the last result in calculator is " + lastResult + "\n");
                    }
                    case 10 -> {
                        System.out.println("the list of all results in calculator is " + allResults + "\n");
                    }
                    case 11 -> {
                        System.out.println("Goodbye!");
                        System.exit(0);
                    }
                    default -> {
                        System.out.println("Invalid choice. Please enter a valid choice.\n");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.\n");
                input.nextLine();
            }
        } while (choice != 11);
    }
}