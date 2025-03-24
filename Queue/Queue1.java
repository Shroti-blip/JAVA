/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacollege;

//import java.util.*;
import java.util.Queue;
import java.util.LinkedList;


/**
 *
 * @author ASUS
 */
public class Queue1 {

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);//offer()
        q1.add(2);
        q1.add(3);
        q1.add(4);

        System.out.println(q1);
        System.out.println(q1.size());

        int c = q1.peek();//tell first element//element()
        System.out.println(c);

        int d = q1.poll();//Removes and returns the front element. //remove()
        System.out.println(d);
        System.out.println(q1);

        boolean t = q1.isEmpty();
        System.out.println(t);

        q1.clear();
        System.out.println(q1);

        boolean y = q1.isEmpty();
        System.out.println(y);

    }

}
