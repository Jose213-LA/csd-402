// Name: Jose Flores
// Date: 7/5/2025
// Assignment: M9 
/* Purpose: This program displays a list of strings and 
            lets the user retrieve an item by index with error handling.*/ 

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // Create an ArrayList with at least 10 Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");
        stringList.add("Fig");
        stringList.add("Grape");
        stringList.add("Honeydew");
        stringList.add("Icedtea");
        stringList.add("Jackfruit");

        // Use for-each loop to print each item
        System.out.println("Elements in the ArrayList:");
        for (String item : stringList) {
            System.out.println(item);
        }

        // Ask user which element they would like to see again
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0-9) of the element you want to see again: ");
        String userInput = scanner.nextLine();

        try {
            // Auto-Unboxing from String to int
            int index = Integer.parseInt(userInput);  // auto-unboxing example
            String selectedItem = stringList.get(index);
            System.out.println("Element at index " + index + ": " + selectedItem);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number.");
        }
    }
}