/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class ShowAb extends AbstractClass {
    @Override//override notation for abstract methods
    void show(){//writing return type is most imp 
         System.out.println("this is first abstract method");
     }
    @Override
    void display(int a , int b){
      System.out.println(a+b);
    }
    
    public static void main(String[] args) {
       ShowAb s = new ShowAb();
       s.show();//accessing them with the help of child class object.
       s.display(5,5);
       s.print();
       System.out.println(s.sum(2,2,2));
    }
    
}
