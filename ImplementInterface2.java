/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class ImplementInterface2 extends InheritanceClass implements Interface2{

//     super.method1(1,2);
   @Override
  public void greet(){//why all method should be public here??
       System.out.println("Welcome to greet method");
   }
  @Override
  public void name(String str){
      System.out.println("My name is "+ str);
  }
  
  
    public static void main(String[] args) {
        ImplementInterface2 ii = new ImplementInterface2();
        ii.greet();
        ii.name("Muskan");
        ii.method1(3, 5);
       
    }
    
}
