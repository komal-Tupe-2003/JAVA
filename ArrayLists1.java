import java.util.*;
class ArrayLists1
{
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList();
    
    //add items
    list.add("milk");
    list.add("butter");
    list.add("bread");
    list.add("tea");
    System.out.println(list);

    //add elements in betn
     list.add(1, "coffee");
    System.out.println(list);

    //replace elements 
    list.set(1,"sugar");
    System.out.println(list);

    //size of list
    int size = list.size();
    System.out.println(size);

    //sorting
    Collections.sort(list);
    System.out.println(list);
    


    }

}