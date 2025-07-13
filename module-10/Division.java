/* Name: Jose Flores
   Date: 7/12/2025
   Assignment: M10 */

public abstract class Division {
    private String divisionName;
    private String accountNumber;

    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}