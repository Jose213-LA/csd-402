//Name: Jose Flores
//Date: 6/5/2025
//Assignment: Assignment_3
//Purpose: Write a program that uses nested for loops.



public class NestedForLoops {
    public static void main(String[] args) {
        int rows = 7;

        // First, determine the total width of the last line (used to align the @)
        int maxLineLength = 0;
        StringBuilder sb = new StringBuilder();
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            sb.setLength(0);
            // Add leading spaces
            for (int j = i; j < rows; j++) {
                sb.append("   ");
            }

            num = 1;
            // Add increasing numbers
            for (int j = 1; j <= i; j++) {
                sb.append(String.format("%3d", num));
                num *= 2;
            }

            num /= 4;
            // Add decreasing numbers
            for (int j = 1; j < i; j++) {
                sb.append(String.format("%3d", num));
                num /= 2;
            }

            if (sb.length() > maxLineLength) {
                maxLineLength = sb.length();
            }
        }

        // Now print all rows with @ aligned to maxLineLength + padding
        for (int i = 1; i <= rows; i++) {
            sb.setLength(0);
            for (int j = i; j < rows; j++) {
                sb.append("   ");
            }

            num = 1;
            for (int j = 1; j <= i; j++) {
                sb.append(String.format("%3d", num));
                num *= 2;
            }

            num /= 4;
            for (int j = 1; j < i; j++) {
                sb.append(String.format("%3d", num));
                num /= 2;
            }

            // Pad spaces to align @ vertically
            while (sb.length() < maxLineLength) {
                sb.append(" ");
            }

            sb.append("   @"); // Add @ with spacing

            System.out.println(sb.toString());
        }
    }
}