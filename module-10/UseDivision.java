/* Name: Jose Flores
   Date: 7/12/2025
   Assignment: M10 */

public class UseDivision {
    public static void main(String[] args) {
        // Create two InternationalDivision objects
        InternationalDivision intDiv1 = new InternationalDivision("Asia Sales", "INT001", "Japan", "Japanese");
        InternationalDivision intDiv2 = new InternationalDivision("Europe Sales", "INT002", "Germany", "German");

        // Create two DomesticDivision objects
        DomesticDivision domDiv1 = new DomesticDivision("West Coast Sales", "DOM001", "California");
        DomesticDivision domDiv2 = new DomesticDivision("East Coast Sales", "DOM002", "New York");

        // Display info for all divisions
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}