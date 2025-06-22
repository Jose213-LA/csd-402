// Name: Jose Flores
// Date: 6/20/2025
// Assignment: M5
/* Purpose: To write a program that finds the place (row and column) 
of the biggest and smallest numbers in a 2D array and shows 
where they are.*/

public class ArrayLocationFinder {

    // Locate the largest element in a double 2D array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate the largest element in an int 2D array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate the smallest element in a double 2D array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate the smallest element in an int 2D array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Main method to test the functions
    public static void main(String[] args) {
        int[][] intArray = {
            {3, 5, 9},
            {1, 7, 4},
            {6, 8, 2}
        };

        double[][] doubleArray = {
            {1.5, 2.3, 3.9},
            {0.1, 9.8, 1.1}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest in int array at: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest in int array at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
        System.out.println("Largest in double array at: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest in double array at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
    }
}