package javacollege;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Exception2 {

    static void function1(){
        try{
            int c = 10/0;
        System.out.println(c);
        }
        catch(Exception e){
            System.out.println("exception is : " + e);
        }
         finally{
            System.out.println("--------This will run always---------");
        }
    }
   
    
    static void function2(){
        try{
             int[] arr = {1,2,3,4,5,6};
        System.out.println(arr[12]);
        
        }catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Exception is : "+ e);   
        }
        finally{
            System.out.println("-------This will run always---------");
        }
    }
    public static void main(String[] args) {
       
        function1();
        function2();
        System.out.println("Back to main");
    }
    
}
