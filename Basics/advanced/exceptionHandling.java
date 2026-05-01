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
            System.out.println();
            System.out.println("------ end ------");
        }
    }
}
