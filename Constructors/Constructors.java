/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class Constructors {

    String brand;//instance variable -- field variable--declare outside any function ,block or constructor.
    int age;
    
    public Constructors(){//default constructor
        this.brand="";
        this.age=0;
        
        System.out.println("value of this is this : "+ this.brand);
        System.out.println("value of this is this : " + this.age);
    }
    
    public Constructors(String brand, int age){//parametrized constructor
        this.brand=brand;//this.brand contain global variable brand
        this.age=age;
        System.out.println("name of brand is : "+this.brand);
        System.out.println("age is : "+ this.age);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Constructors c = new Constructors();
       Constructors c1 = new Constructors("Socket",18);
//       System.out.println(c1);
      
    }
    
}
