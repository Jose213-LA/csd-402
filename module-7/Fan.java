// Name: Jose Flores
// Date: 6/27/2025
// Assignment: M7
/* Purpose: To create and store information about a fan, 
like its speed, if it's on or off, its color, and size.*/

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

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Constructor with parameters
    public Fan(int speed, boolean on, double radius, String color) {
        this.setSpeed(speed);
        this.setOn(on);
        this.setRadius(radius);
        this.setColor(color);
    }

    // Getters and setters
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        if (speed == STOPPED || speed == SLOW || speed == MEDIUM || speed == FAST) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Invalid speed value");
        }
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius must be positive");
        }
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Color cannot be null");
        }
    }

    // toString method
    @Override
    public String toString() {
        if (this.on) {
            String speedStr;
            switch (this.speed) {
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
            return "Fan is ON - Speed: " + speedStr + ", Radius: " + this.radius + ", Color: " + this.color;
        } else {
            return "Fan is OFF - Radius: " + this.radius + ", Color: " + this.color;
        }
    }
}