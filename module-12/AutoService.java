/* Name: Jose Flores
   Date: 7/26/2025
   Assignment: M12
   Purpose: The purpose of this program is to find out 
   how much a car service visit costs based on what services are included. */

public class AutoService {

    // Constants for base service charges
    static final double STANDARD_SERVICE_CHARGE = 150.00;
    static final double DEFAULT_OIL_CHANGE_FEE = 40.00;
    static final double DEFAULT_TIRE_ROTATION_CHARGE = 30.00;

    // Method 1: No parameters
    public static double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }

    // Method 2: One parameter (oil change fee)
    public static double yearlyService(double oilChangeFee) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee;
    }

    // Method 3: Two parameters (oil change + tire rotation)
    public static double yearlyService(double oilChangeFee, double tireRotationCharge) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationCharge;
    }

    // Method 4: Three parameters (oil change + tire rotation - coupon)
    public static double yearlyService(double oilChangeFee, double tireRotationCharge, double couponAmount) {
        return (STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationCharge) - couponAmount;
    }

    // Main method to test each version of yearlyService
    public static void main(String[] args) {
        System.out.println("Testing yearlyService with no parameters:");
        System.out.println("Test 1: $" + yearlyService());
        System.out.println("Test 2: $" + yearlyService());

        System.out.println("\nTesting yearlyService with one parameter (oil change fee):");
        System.out.println("Test 1: $" + yearlyService(45.00));
        System.out.println("Test 2: $" + yearlyService(40.00));

        System.out.println("\nTesting yearlyService with two parameters (oil change + tire rotation):");
        System.out.println("Test 1: $" + yearlyService(45.00, 35.00));
        System.out.println("Test 2: $" + yearlyService(40.00, 30.00));

        System.out.println("\nTesting yearlyService with three parameters (oil change + tire rotation - coupon):");
        System.out.println("Test 1: $" + yearlyService(45.00, 35.00, 20.00));
        System.out.println("Test 2: $" + yearlyService(40.00, 30.00, 15.00));
    }
}