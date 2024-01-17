import java.util.*;
class iterator
{
    public static void main(String args[])
    {
        ArrayList l1 = new ArrayList();
        l1.add("rupa");
        l1.add("dipa");
        l1.add("sans");
        l1.add("sana");
        Iterator itr = l1.iterator();
        while(itr.hasNext())
        {
        System.out.println(itr.next());
        }
    }
}