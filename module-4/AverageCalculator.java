//Name: Jose Flores
//Date: 6/14/2025
//Assignment: Assignment-4
/*Purpose: Write four overloaded methods that return the 
average of an array.*/


public class AverageCalculator {

    // Method to calculate average of short array
    public static short average(short[] array) {
        int sum = 0; // Use int to prevent overflow
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate average of int array
    public static int average(int[] array) {
        long sum = 0; // Use long to prevent overflow
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    // Method to calculate average of long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Helper method to print short array
    public static void printArray(short[] array) {
        System.out.print("short[]: ");
        for (short num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Helper method to print int array
    public static void printArray(int[] array) {
        System.out.print("int[]: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Helper method to print long array
    public static void printArray(long[] array) {
        System.out.print("long[]: ");
        for (long num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Helper method to print double array
    public static void printArray(double[] array) {
        System.out.print("double[]: ");
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        short[] shortArr = {10, 20, 30, 40};
        int[] intArr = {100, 200, 300, 400, 500};
        long[] longArr = {1000L, 2000L, 3000L};
        double[] doubleArr = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Test short average
        printArray(shortArr);
        System.out.println("Average (short[]): " + average(shortArr));
        System.out.println();

        // Test int average
        printArray(intArr);
        System.out.println("Average (int[]): " + average(intArr));
        System.out.println();

        // Test long average
        printArray(longArr);
        System.out.println("Average (long[]): " + average(longArr));
        System.out.println();

        // Test double average
        printArray(doubleArr);
        System.out.println("Average (double[]): " + average(doubleArr));
    }
}