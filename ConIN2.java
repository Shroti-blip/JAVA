/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class ConIN2 extends ConIN{
int a,b,c;
   ConIN2(int a , int b , int c){
       super(a,b);// Passes child class parameters 'a' and 'b' to parent class
       this.c = c; 
       System.out.println(c);
//       this.b = b;
   }
    public static void main(String[] args) {
      ConIN2 c = new ConIN2(5,5,5);
      
    }
    
}
