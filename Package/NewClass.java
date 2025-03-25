/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class NewClass {
    
    interface MyInterface {
    void myMethod();
}

class MyClass {
    void myMethod() {
        System.out.println("Inside MyClass myMethod");
    }
}

class ChildClass extends MyClass implements MyInterface {
    public void myMethod() {
        super.myMethod();  // Calls MyClass's method
        System.out.println("Inside ChildClass myMethod");
    }
}

public class Main {
    public static void main(String[] args) {
//        ChildClass obj = new ChildClass();
//        obj.myMethod();
    }
}

    
}
