/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class Stringbuilder {

   
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("HOLA");
        sb.append(" WELCOME");
        System.out.println(sb);
        int a = sb.capacity();
        System.out.println(a);
        
        int l =sb.length();
        System.out.println(l);
        
        String[] str1 = {"Apple", "Mango","Banana","Grapes"};
        String word ="Mango and Banana are my fav. fruit";
        
        boolean found = false;
        for(int i =0;i<str1.length; i++){
            if(str1[i].equals(word)){
                found = true;
                break;
            }
        }
        
        if(found == false){
            System.out.println(" misspell word  " + word+ "  not found");
        }
        else{
            System.out.println("complete");
        }
    }
    
}
