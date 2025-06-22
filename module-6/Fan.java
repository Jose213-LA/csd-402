// Name: Jose Flores
// Date: 6/21/2025
// Assignment: M6
/* Purpose: To write a program with a class titled Fan 
and what it contains.*/

public class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor with default values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Constructor with parameters
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and setters

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed == STOPPED || speed == SLOW || speed == MEDIUM || speed == FAST) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Invalid speed value");
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius must be positive");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Color cannot be null");
        }
    }

    // toString method to describe the fan's state
    @Override
    public String toString() {
        if (on) {
            String speedStr;
            switch (speed) {
                case STOPPED:
                    speedStr = "STOPPED";
                    break;
                case SLOW:
                    speedStr = "SLOW";
                    break;
                case MEDIUM:
                    speedStr = "MEDIUM";
                    break;
                case FAST:
                    speedStr = "FAST";
                    break;
                default:
                    speedStr = "UNKNOWN";
            }
            return "Fan is ON - Speed: " + speedStr + ", Radius: " + radius + ", Color: " + color;
        } else {
            return "Fan is OFF - Radius: " + radius + ", Color: " + color;
        }
    }

    // Test code inside the same file (or use a separate class)
    public static void main(String[] args) {
        // Default fan
        Fan fan1 = new Fan();
        System.out.println("Default fan:");
        System.out.println(fan1);
        System.out.println();

        // Fan with parameters
        Fan fan2 = new Fan(FAST, true, 10, "blue");
        System.out.println("Fan with parameters:");
        System.out.println(fan2);
        System.out.println();

        // Using setters on fan1
        fan1.setSpeed(MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("yellow");
        System.out.println("Updated default fan:");
        System.out.println(fan1);
        System.out.println();

        // Display fan2's attributes using getters
        System.out.println("Fan2 Speed: " + fan2.getSpeed());
        System.out.println("Fan2 On: " + fan2.isOn());
        System.out.println("Fan2 Radius: " + fan2.getRadius());
        System.out.println("Fan2 Color: " + fan2.getColor());
    }
}