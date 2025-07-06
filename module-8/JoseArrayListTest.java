// Name: Jose Flores
// Date: 7/2/2025
// Assignment: M8 Array List Test.
/* Purpose: To create a program program that lets the user enter numbers, 
            save them in a list, and show the biggest number.*/

import java.util.ArrayList;
import java.util.Scanner;

public class JoseArrayListTest {

    // Method to find the maximum value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        Integer maxValue = list.get(0);
        for (Integer number : list) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                numbers.add(input); // Add input to the ArrayList

                if (input == 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }

        // Call the max method and display the result
        Integer maxValue = max(numbers);
        System.out.println("The largest value is: " + maxValue);

        scanner.close();
    }
}