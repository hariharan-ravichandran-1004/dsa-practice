package Basics.conditional;

public class NestedIf {
    public static void main(String args[]) {
        int age = 8;
        boolean haveVoterID = true;
        if (age > 18) {
            if (haveVoterID) {
                System.out.println("\n You are eligible to vote in india. You've voter id also. ");
            } else {
                System.out.println("\n You don't have voter id. However, You ain't eligible to vote in india. ");

            }
        } else {
            System.out.println("\nYou ain't eligible to vote in india.");
        }
    }
}
