// Parent class
class Omnivorous {
    void show() {
        System.out.println("Animals Talk");
    }
}

// Child class 1
class Dog extends Omnivorous {
    void show() {
        System.out.println("Dogs-Barks");
    }
}

// Child class 2
class Cat extends Omnivorous {
    void show() {
        super.show(); // call parent method
        System.out.println("Cats-Meow");
    }
}

// Main class (must match file name)
public class Inheritence {
    public static void main(String[] args) {
        Omnivorous a1 = new Dog();  
        Omnivorous a2 = new Cat();  

        a1.show(); 
        a2.show(); 
    }
}

class Person{
    void role(){
        System.out.println("Person has a role ");
    }
}
class Employee extends Person{
    void role(){
        System.out.println("Employee works");
    }
}
class Developer extends Person{
    void role(){
        super.role();
        System.out.println("Developers writes code");
    }
}

class Inheritence1{
    public static void main(String[]args){
        Person p = new Person();
        Employee e = new Employee();
        Developer d = new Developer();
        p.role();
        e.role();
        d.role();

    }
}

class Device{
    void start(){
        System.out.println("Device starting");
    }
}
class Computer extends Device{
    void start(){
        System.out.println("Computer starting");
        super.start();
    }
}
class Laptop extends Computer{
    void start(){
        System.out.println("Laptop starting");
        super.start();
    }
}
class Inheritence2{
    public static void main(String[]args){
        Device d = new Device();
        Computer c = new Computer();
        Laptop l = new Laptop();

        d.start();
        c.start();
        l.start();
    }
}