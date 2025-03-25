/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class CharacterFunctions {

   
    public static void main(String[] args) {
        String str = "      Muskan      ";
        
        System.out.println(str);
        System.out.println(str.trim());
        char ch = str.charAt(1);
        System.out.println(ch);
        
        char ch1 = 't';
        boolean a = Character.isDigit(ch1);
        System.out.println(a);
        
        boolean b = Character.isWhitespace(ch1);
        System.out.println(b);
        
        boolean c = Character.isLetter(ch1);
        System.out.println(c);
        
        boolean d = Character.isLetterOrDigit(ch1);
        System.out.println(d);
        
        //ANSI == AMERICAN NATIONAL STANDARD INSTITUTE 
        //asci value 
        
        //A-Z ---- 65-90 &&&& a-z ------97-122 &&&&   0-9 -----48 - 57
        
         System.out.println();
        
        
    }
    
}
