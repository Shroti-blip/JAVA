package javacollege;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class FinalKeyAB extends FinalKey{
@Override
void use(){
    System.out.println("extending / overriding use method" );
}
    public static void main(String[] args) {
       FinalKeyAB fa = new FinalKeyAB();
       fa.use();
       fa.show(50);
    }
    
}
