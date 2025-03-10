/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class copyC {
String name;
int age;
 copyC(String name, int age){
     this.name = name;
     this.age= age;
 }
 
 copyC (copyC n , copyC m){
     this.name = n.name;
     this.age = m.age;
 }
 void getData(){
     System.out.println("Name is : " + name);
     System.out.println("age is : " + age);
 }
 
 
    public static void main(String[] args) {
     copyC c = new copyC("Muskan",18);
     copyC c1 = new copyC(c ,c);
     c.getData();
     c1.getData();
     
    }
    
}
