package javacollege;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Exception4 {
    
    static void CreateArray(int sz){
        try{
            if(sz==0)
                throw new NegativeArraySizeException ("Error message");//3
            int[] arr = new int [sz];
             System.out.println("Size is "+ sz);//1
        }
        catch(NegativeArraySizeException e){
            System.out.println("exception is"+ e);//2
        }
    }
    
    public static void main(String[] args) {
       CreateArray(4);
       CreateArray(-4);
       CreateArray(0);
    }
    
}
