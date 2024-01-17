import java.util.*;
class iterator2
{
    public static void main(String args[])
    {
        ArrayList list = new ArrayList();
        list.add("rupa");
        list.add("dipa");
        list.add("sans");
        list.add("sana");

        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
}