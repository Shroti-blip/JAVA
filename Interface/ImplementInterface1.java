/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class ImplementInterface1 implements Interface1{

   @Override
  public void method1(){
       System.out.println("this is method one");
   }
  
  @Override
  public void method2(){
       System.out.println("this is method two");
   }
  
  @Override
  public void method3(){
       System.out.println("this is method three");
   }
    public static void main(String[] args) {
        ImplementInterface1 ii = new ImplementInterface1();
        ii.method1();
        ii.method2();
        ii.method3();
    }
    
}
