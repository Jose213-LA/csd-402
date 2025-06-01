//Name: Jose Flores
//Date: 6/1/2025
//Assignment: Programming Assignment
//Purpose: Write a program that calculates energy needed to heat water.

import java.util.Scanner;

public class WaterHeatingEnergyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for water mass in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // Prompt user for initial temperature
        System.out.print("Enter the initial temperature (Celsius): ");
        double initialTemperature = input.nextDouble();

        // Prompt user for final temperature
        System.out.print("Enter the final temperature (Celsius): ");
        double finalTemperature = input.nextDouble();

        // Calculate energy using the formula
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.printf("The energy needed to heat the water is %.2f joules.%n", Q);

        input.close();
    }
}