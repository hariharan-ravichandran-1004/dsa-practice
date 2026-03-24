package Basics;

public class StringClass {
    public static void main(String args[]) {
        // create a new object when update the value
        String str = "Hello";
        str = str + " World";
        System.out.println(str);

        // use the same object when update the value but not thread safe
        StringBuilder sbr = new StringBuilder("Hello");
        sbr.append("Wordl");
        System.out.println(sbr);

        // use the same object when update the value and thread safe
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf);
        System.out.println(sbf.length());
        System.out.println(sbf.charAt(0));
        System.out.println(sbf.substring(0, 5));
        System.out.println(str.split(" ")[1]);


    }
}
