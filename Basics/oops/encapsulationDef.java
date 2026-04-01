package Basics.oops;

public class encapsulationDef {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Travis");
        String name = p.getName();
        System.out.println();
        System.out.println(name);
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}