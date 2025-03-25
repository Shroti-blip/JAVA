/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class HairstyleINO extends SalonIN {
//String stylename;
//int num;//no need for making them here

    void show(String name,int price) {
        //  super.show("Dooshik Salon" , 2000);// Call the parent class method
        super.show(name, price);
        super.getData();
//        System.out.println("this is overriden method");

        //   show("Dooshik Salon" , 2000);
        //   this.stylename = stylename;
        //  System.out.println(stylename);
    }

    public static void main(String[] args) {
        HairstyleINO ho = new HairstyleINO();
        ho.show("Dooshik Salon", 2000);
//      ho.getData();
//      ho.show("Dooshik Salon" , 2000);
//      ho.getData("Hola");
    }

}
