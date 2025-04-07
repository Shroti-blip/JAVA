/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coderush;

/**
 *
 * @author Veersingh Lodhi
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Palindrome
        
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a String : ");
        String str=sc.nextLine();
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            temp+=str.charAt(i);
        }
        System.out.println(str.equals(temp));
        
    }
    
}
