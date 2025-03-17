package javacollege;

// File: PackImport.java
// Import the First class from Package
import Package.First;

public class PackImport {
    public static void main(String[] args) {
        // Call the static method without an object
//        First.method(); 
        
       First f = new First();
        f.method();
        f.method1();
        
        // OR, if you want to use an object, modify First.java to remove "static"
        // First f = new First();
        // f.method();
    }
}
