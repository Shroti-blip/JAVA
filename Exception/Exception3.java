/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class Exception3 {

    static void division(int a , int b){
        try{
            if(b<0)
                throw new ArithmeticException ("Negative values");//throwing a custom exception.
            int c = a/b;
            System.out.println("Division is : "+ c);
        }catch(ArithmeticException e){
            System.out.println("Exception is : "+ e);//both will execute throw and this one too
        }
    }
   
    public static void main(String[] args) {
        division(10,2);
        division(10,0);
        division(10,-2);
    }
    
}
