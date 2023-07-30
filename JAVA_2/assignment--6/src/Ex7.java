import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //7.Write a menu driven Java program with following option:

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        try {
            int size = input.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                array[i] = input.nextInt();
            }

            int choice = 0;
            do {
                System.out.println("Menu");
                System.out.println("1. Accept elements of an array");
                System.out.println("2. Display elements of an array");
                System.out.println("3. Search the element within array");
                System.out.println("4. Sort the array");
                System.out.println("5. Stop");
                System.out.print("Enter your choice: ");
                try {
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter the size of the array: ");
                            size = input.nextInt();
                            array = new int[size];
                            for (int i = 0; i < size; i++) {
                                System.out.print("Enter element " + (i + 1) + ": ");
                                array[i] = input.nextInt();
                            }
                            break;
                        case 2:
                            System.out.println("Elements of the array: " + Arrays.toString(array));
                            break;
                        case 3:

                            System.out.print("Enter the number to search: ");
                            int index = -1;
                            try {
                                int key = input.nextInt();
                                for (int j : array) {
                                    if (j == key) {
                                        index = j;
                                        break;
                                    }
                                }
                                if (index == -1) {
                                    System.out.println("number not found in the array");
                                } else {
                                    System.out.println("number " + index + " found in array  ");
                                }
                            }catch (InputMismatchException e3){
                                System.out.println("enter valid number");
                            }
                            break;

                        case 4:
                            Arrays.sort(array);
                            System.out.println("Array sorted in ascending order: " + Arrays.toString(array));
                            break;

                        case 5:
                            System.out.println("Exiting program...");
                            break;

                        default:
                            System.out.println("Invalid choice, please try again");
                    }
                } catch (InputMismatchException e1) {
                    System.out.println("please enter a number between 1-5");
                    break;

                }
            } while (choice != 5);
        } catch (InputMismatchException e) {
            System.out.println("please enter a number valid number");

        }
    }
}

