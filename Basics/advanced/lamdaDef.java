package Basics.advanced;

public class lamdaDef {
    public static void main(String[] args) {
        System.out.println();
        Runnable r = () -> System.out.println("Hello");
        r.run();
        }
}
