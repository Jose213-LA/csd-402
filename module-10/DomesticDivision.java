/* Name: Jose Flores
   Date: 7/12/2025
   Assignment: M10 */

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
        System.out.println();
    }
}
