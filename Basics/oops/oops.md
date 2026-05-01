# Object-Oriented Programming (OOP) in Java

## 1. Classes & Objects

### Definition

* **Class**: Blueprint for creating objects
* **Object**: Instance of a class

### Example

```java
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.speed = 120;
        c1.drive();
    }
}
```

### `this` Keyword

* Refers to current object
* Used to resolve variable conflicts

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

---

## 2. Constructors

### Definition

* Special method used to initialize objects
* Same name as class, no return type

### Types

#### Default Constructor

```java
class Test {
    Test() {
        System.out.println("Default constructor");
    }
}
```

#### Parameterized Constructor

```java
class Test {
    int x;

    Test(int x) {
        this.x = x;
    }
}
```

---

## 3. Access Modifiers

| Modifier  | Access Level            |
| --------- | ----------------------- |
| public    | Everywhere              |
| private   | Same class only         |
| protected | Same package + subclass |
| default   | Same package            |

```java
class Demo {
    public int a = 10;
    private int b = 20;
}
```

---

## 4. Inheritance

### Definition

* One class inherits properties from another

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

### Method Overriding

```java
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## 5. Polymorphism

### Compile-time (Method Overloading)

```java
class MathUtil {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### Run-time (Method Overriding)

* Same method, different implementation in child class

---

## 6. Encapsulation

### Definition

* Wrapping data and methods together
* Use private variables + getters/setters

```java
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

---

## 7. Abstraction

### Abstract Class

```java
abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}
```

### Interface

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## 8. Static Keyword

### Static Variable

```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}
```

### Static Method

```java
class Utils {
    static void display() {
        System.out.println("Static method");
    }
}
```

---

## 9. Final Keyword

### Final Variable

```java
final int x = 10;
```

### Final Method

```java
class A {
    final void show() {}
}
```

### Final Class

```java
final class A {}
```

---

## OOP Summary

* Class → Blueprint
* Object → Instance
* Encapsulation → Data hiding
* Inheritance → Code reuse
* Polymorphism → Multiple behaviors
* Abstraction → Hide implementation
