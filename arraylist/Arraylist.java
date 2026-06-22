package arraylist;

import java.util.*;

public class Arraylist {
  public static void main(String[] args){
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(-10);
    System.out.println(list);
    list.add(10);
    System.out.println(list);

    //for loop with arraylist
    for (int i = 0 ; i < list.size(); i++){
      System.out.print(list.get(i) + " ");
    }

    System.out.println();

    System.out.println(list.contains(10));

    list.remove(Integer.valueOf(-10));

    System.out.println(list);


    Object[] arr = list.toArray();
    for(Object o : arr){
      System.out.println(o);
    }


  }
}
