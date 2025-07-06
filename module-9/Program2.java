// Name: Jose Flores
// Date: 7/5/2025
// Assignment: M9
/* Purpose: This program creates or appends random numbers 
            to a file and then displays the file contents.*/

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random rand = new Random();

        try {
            // Create file if it doesn't exist, else append
            FileWriter writer = new FileWriter(file, true); // 'true' enables append mode

            System.out.println("Writing 10 random numbers to data.file...");
            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(100); // Random number between 0-99
                writer.write(num + " ");
            }

            writer.write(System.lineSeparator()); // Add newline for clarity
            writer.close();

            // Now read and display the file contents
            Scanner fileReader = new Scanner(file);
            System.out.println("\nContents of data.file:");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while working with the file.");
            e.printStackTrace();
        }
    }
}