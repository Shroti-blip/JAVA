/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

import java.util.Queue;
import java.util.PriorityQueue;
public class Queue2 {

   
    public static void main(String[] args) {
      //Queue is an interface which can be get created with the help of LinkedList and PriorityQueue.               
        Queue<String> q1  = new PriorityQueue<>();
        q1.add("Mango");
        q1.add("Orange");
        q1.add("Grapes");
        q1.add("Apple");
        q1.add("Banana");
        System.out.println(q1);
        
        
        
    }
    
}
