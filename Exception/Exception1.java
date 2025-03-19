/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

/**
 *
 * @author ASUS
 */
public class Exception1 {

    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println("division is " + c);

            int[] arr = {1, 2, 3, 4, 5};
            
            System.out.println(arr[20]);
            }
//           catch (Exception e) {// general handler for all code exception (if put firstly it then it will take/handel all exception itselt)
//            System.out.println("Exception is" + e);
//             } 
        catch (ArithmeticException ex) {
            System.out.println("exception is :" + ex);
        }
        catch(ArrayIndexOutOfBoundsException ea){//compiler cant reach this exception because of first one ,, 
            System.out.println("Exception is "+ ea);//, only one catch block executes per exception.
        }
        catch(Exception e){//for handling any other exception
            System.out.println("Exception is: "+ e);
        }
    }

}
