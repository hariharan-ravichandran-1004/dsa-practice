package Basics.advanced;

public class exceptionHandling {
    public static void main(String[] args) {
        System.out.println();
        int a=0;
        try{
            a=Integer.parseInt("a");
        }catch(Exception e){
            System.out.println(e);
        } finally {
            // The assignment above never completed, so 'a' still holds its
            // initial value — the exception aborted the try block mid-statement.
            System.out.println("a = " + a);
            System.out.println("------ end ------");
        }
    }
}
