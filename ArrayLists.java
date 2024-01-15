import java.util.*;
class ArrayLists
{
    public static void main (String args[])
    {
      ArrayList<Integer> list = new ArrayList();

      // add elements
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      //duplicate elemnets are allowed in arraylist
      list.add(4);

      System.out.println(list);

      //get element
      int element = list.get(2);
      System.out.println(element);

      // add elemnet in between
      list.add(2,8);
      System.out.println(list);

      //replace element
      list.set(1,6);
      System.out.println(list);

      //remove element
      list.remove(4);
      System.out.println(list);


      // size of list
      int size = list.size();
      System.out.println(size);


      //adding first elemnet in arraylist
      list.addFirst(7);
      System.out.println(list);

      // adding last element in arraylist
      list.addLast(9);
      System.out.println(list);

      //sorting
      Collections.sort(list);
      System.out.println(list);

      
    }
}