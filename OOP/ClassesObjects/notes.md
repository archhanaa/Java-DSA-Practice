# 🧩 Java OOP – Classes & Objects (Day-3 Notes)

## 1️⃣ What is a Class?
- Class = Blueprint / Plan
- It tells what variables (properties) and methods (actions) an object will have.
- It doesn’t store values — only defines structure.

### Example
```java
class Car {
    String color;     // instance variable
    int speed;        // instance variable

    void drive() {    // instance method
        System.out.println("Car is driving");
    }
}
```

---

## 2️⃣ What is an Object?
- Object = Real instance created from class
- Created using `new`
- Stores actual values

### Example
```java
Car c1 = new Car();
```

---

## 3️⃣ Instance Variables
- Declared inside class but outside methods
- Each object gets **its own copy**
- Stored in **heap memory**

### Example
```java
String color;
int speed;
```

---

## 4️⃣ Instance Methods
- Work using instance variables
- Called using objects

### Example
```java
c1.drive();
```

---

## 5️⃣ Constructor
- Special method that runs automatically when object is created
- Used to initialize values

### Types
1. Default (provided by JVM)
2. No-argument constructor
3. Parameterized constructor

### Example
```java
Car(String c, int s) {
    this.color = c;
    this.speed = s;
}
```

---

## 6️⃣ `this` Keyword
- Refers to the present object
- Used to differentiate instance variables from parameters
- Can be used for constructor chaining

### Example
```java
this.color = color;
```

---

## 7️⃣ Constructor Overloading
Multiple constructors with:
- Same name  
- Different parameters

### Example
```java
Car() {}
Car(String color) {}
Car(String color, int speed) {}
```

---

## 8️⃣ Memory Diagram (Very Simple)

### 🔹 Stack Memory Stores:
- Reference variables  
- Local variables  
- Parameters  

### 🔹 Heap Memory Stores:
- Objects  

### Example
```java
Car c1 = new Car("Red", 120);
```

Stack:
```
c1 → reference
c = "Red"  (parameter)
s = 120    (parameter)
```

Heap:
```
Car object:
    color = "Red"
    speed = 120
```

After constructor ends:
- `c` and `s` (parameters) are removed
- Object stays in heap
- `c1` still points to the object

---

## 9️⃣ Common Mistakes
❌ Confusing instance variables with parameters  
❌ Writing `color = color` without using `this`  
❌ Thinking object is in stack (NO – only in heap)  
❌ Thinking constructors return something  
❌ Forgetting each object has separate variable copies  

---

## 🔟 Summary
- Class = Blueprint  
- Object = Instance  
- Instance variables = Belong to object  
- Local variables = Belong to method  
- Parameters = Temporary inputs  
- Heap = Objects  
- Stack = references + locals + parameters  
- Constructor = initializes object  

---
