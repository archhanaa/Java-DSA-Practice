// examples.java
// Simple examples for Classes, Objects, Constructors, this keyword

class Car {
    String color;    // instance variable
    int speed;       // instance variable

    // No-arg constructor
    Car() {
        this.color = "Blue";
        this.speed = 50;
    }

    // Parameterized constructor
    Car(String color, int speed) {
        this.color = color;   // this.color = instance variable
        this.speed = speed;
    }

    void drive() {
        System.out.println(color + " car is driving at " + speed + " km/h");
    }

    void showDetails() {
        int x = 10; // local variable
        System.out.println("Local x = " + x);
    }
}

public class Examples {
    public static void main(String[] args) {
        // Using no-arg constructor
        Car c1 = new Car();
        c1.drive();  // Blue car is driving at 50 km/h

        // Using parameterized constructor
        Car c2 = new Car("Red", 120);
        c2.drive();  // Red car is driving at 120 km/h

        // Demonstrate stack vs heap (visual only)
        c2.showDetails(); // Local variable x printed then disappears
    }
}
