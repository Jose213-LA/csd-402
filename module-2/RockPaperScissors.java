//Name: Jose Flores
//Date: 6/7/2025
//Assignment: Rock-Paper-Scissors
//Purpose: Write a popular game program, Rock Paper Scissors.

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Setup tools
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Computer makes a random choice: 1 = Rock, 2 = Paper, 3 = Scissors
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Your choice: ");

        int userChoice = scanner.nextInt();

        // Validate input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input. Please enter 1, 2, or 3.");
            return;
        }

        // Display choices
        String[] options = {"Rock", "Paper", "Scissors"};
        System.out.println("You chose: " + options[userChoice - 1]);
        System.out.println("Computer chose: " + options[computerChoice - 1]);

        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}