/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacollege;


public  abstract class AbstractClass {
    abstract void show();
    abstract void display(int a , int b);
     void print(){
        System.out.println("hola amiga,, this method is directly getting access  by child class object");
    }
     int sum(int a , int b, int  c){
         return a+b+c;
     }
  
    
    
}
