import java.util.*;
class hashmapitr
{
    public static void main(String args[])
    {
        HashMap<Integer,String> hm = new HashMap();

        hm.put(1,"komal");
        hm.put(2,"snehal");
        hm.put(3,"kajal");
        hm.put(4,"rupa");

       // System.out.println(hm);

       System.out.println("iterarating hashmap........");
       for(Map.Entry m:hm.entrySet())
       {
        System.out.println(m.getKey()+" " +m.getValue());
       }
        

        
    }
}