package Basics.conditional;
public class switchCondition {
    public static void main(String args[]) {
        String city = "Coimbatore";
        switch (city) {
            case "Coimbatore": 
                System.out.println("\nIt is an industrial area.");
                break;
            case "Bengaluru":
                System.out.println("\nIt is an IT Hub.");
                break;
            default:
                System.out.println("\nUnknown");
        }
    }
}
