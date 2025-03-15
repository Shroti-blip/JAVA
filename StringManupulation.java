/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class StringManupulation {

    public static void main(String[] args) {
        String str = "Muskan";
        int l = str.length();
        System.out.println(l);
        char ch;
        ch = str.charAt(0);
        System.out.println(ch);

        
       String test1  = "Hola";
       String test2 = "amiga";
       String test3 = "hoLa";

       boolean a =test1.equals(test2);
       System.out.println(a);
       
        boolean b = test1.endsWith("H");
        boolean c = test1.startsWith("H");
       System.out.println(b);
       System.out.println(c);
       
        boolean d = test1.equalsIgnoreCase(test3);
                System.out.println(d);
       
         boolean e = test1.equalsIgnoreCase(test2);
                System.out.println(e);
                
                System.out.println(test1.toUpperCase());
                System.out.println(test1.toLowerCase());
                
                
                System.out.println(test1.substring(l, 3));
                System.out.println(test1.indexOf(tezt2));
                
                
                
               }
    

}
