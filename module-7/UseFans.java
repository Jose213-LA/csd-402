// Name: Jose Flores
// Date: 6/27/2025
// Assignment: M7
/* Purpose: To make and show a group of fans and 
display their details without using the toString() method.*/

import java.util.ArrayList;

public class UseFans {

    // Method to display a single Fan without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("Status: " + (fan.isOn() ? "ON" : "OFF"));
        System.out.println("Speed: " + getSpeedAsString(fan.getSpeed()));
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println();
    }

    // Method to display a collection of Fans
    public static void displayFans(ArrayList<Fan> fans) {
        System.out.println("Displaying all fans:\n");
        for (int i = 0; i < fans.size(); i++) {
            System.out.println("Fan #" + (i + 1));
            displayFan(fans.get(i));
        }
    }

    // Helper method to convert speed int to string
    private static String getSpeedAsString(int speed) {
        switch (speed) {
            case Fan.STOPPED: return "STOPPED";
            case Fan.SLOW: return "SLOW";
            case Fan.MEDIUM: return "MEDIUM";
            case Fan.FAST: return "FAST";
            default: return "UNKNOWN";
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create fans
        Fan fan1 = new Fan(); // default
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.SLOW, false, 7.5, "green");
        Fan fan4 = new Fan(Fan.MEDIUM, true, 12, "black");

        // Create a collection of fans
        ArrayList<Fan> fanList = new ArrayList<>();
        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);
        fanList.add(fan4);

        // Display each fan
        displayFans(fanList);
    }
}