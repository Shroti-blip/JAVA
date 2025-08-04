package javacollege;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
public class ArrayList1 {

       public static void main(String[] args) {
         ArrayList<String> li = new ArrayList<>();
         li.add("one");
         li.add("two");
         li.add("three");
         li.add("four");
         li.add("five");
         li.add("six");
              li.add("seven");
         System.out.println(li);
//         li.remove(li);
         li.remove(2);
         System.out.println(li);
        
         System.out.println( li.get(4));
         
         boolean s = li.contains("two");
         System.out.println(s);
         
        int size = li.size();
         System.out.println(size);
         
         //iterating over arraylist
         for(String num : li){
             System.out.println(num);
         }

    }
    
}

