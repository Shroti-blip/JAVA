/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public abstract class FinalKey {
 final int a=20;
 abstract void use();
void show(int a){
//    a=10; cant assign value again.
    System.out.println(a);
    System.out.println("this is a concreate method");
     System.out.println("Instance variable a: " + this.a); // Accessing final instance variable
} 


}
