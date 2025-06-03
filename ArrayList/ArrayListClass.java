 import java.util.*;
 
 public class ArrayListClass {
    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.add(3 , 3);
        System.out.println(list);

        int sizeoflist = list.size();
        System.out.println(sizeoflist);

        list.remove(3);
        System.out.println(list);

        int element = list.get(1);
        System.out.println(element);


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        list2.add("four");


      System.out.println(list2);

      boolean ans = list2.isEmpty();
      System.out.println(ans);



    }
}
