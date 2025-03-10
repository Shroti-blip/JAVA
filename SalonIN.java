/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class SalonIN {
String name; 
int price;
  void show(String name, int price){
      this.name = name;
      this.price = price;
      System.out.println("salon name is : " + name);
      System.out.println("Price is : "+ price);
  }
  
  void getData(){
      System.out.println("this is the Reference method");
//      System.out.println(name);
  }
}
