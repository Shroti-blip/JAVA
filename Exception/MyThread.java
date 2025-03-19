package javacollege;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class MyThread {

    static void test1(){
        try{
        test3();
        }catch(Exception e){
            System.out.println(" Exception is : " +e);
        }
    }
    static void  test3(){
        System.out.println(10/0);
    }
    public static void main(String[] args) throws InterruptedException {
        test1();
      Thread.sleep(3000);// why use Thread.sleep ?
      //is it necessary to thorw InterupptedException??
    }
    
}
