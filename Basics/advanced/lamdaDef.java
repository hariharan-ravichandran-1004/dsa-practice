package Basics.advanced;

public class lamdaDef {
    public static void main(String[] args) {
        System.out.println();
        Runnable r = () -> System.out.println("Hello");
        r.run();

        InnerlamdaDef ild = (int a, int b) -> a * b;
        int tot = ild.operate(10, 3);
        System.out.println(tot);
    }
}

@FunctionalInterface
interface InnerlamdaDef {
    int operate(int a, int b);
}
