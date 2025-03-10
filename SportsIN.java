/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class SportsIN {
    String name ;
    int number;

    void setData(String name,int number){
        this.name = name;
        this.number  = number;
    }
    
    void getData(){
        System.out.println("name of sport is : "+ name);
        System.out.println("number of player is: "+ number);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
