import java.util.*;
class demolinkedlist{
    public static void main(String args[])
    {
        LinkedList linkedlist1 = new LinkedList();
        linkedlist1.add("icecream");
        linkedlist1.add("juice"); 
        //duplicate elements are allow in linked list
        linkedlist1.add("juice");
        linkedlist1.add("shek");
        System.out.println(linkedlist1);

        //remove elemets from the linkedlist
        linkedlist1.remove("icecream");
        System.out.println(linkedlist1);

       // adding elements in first position
        linkedlist1.addFirst("milk");
        System.out.println(linkedlist1);

        // adding elements in last position
        linkedlist1.addLast("tea");
        System.out.println(linkedlist1);

        //replace elements  using set
        linkedlist1.set(0,"coffee");
        System.out.println(linkedlist1);
    }
}
