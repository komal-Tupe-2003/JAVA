import java.util.*;
class hashmap1
{
    public static void main(String args[])
    {
        HashMap<Integer,String> hm = new HashMap();
        hm.put(1,"komal");
        hm.put(8,"sita");
        hm.put(9,"sans");
        hm.put(4,"sana");

       
System.out.println(hm);

//for getting values from hashmap
System.out.println(hm.get(4));

System.out.println(hm.remove(4));

// for iteration
System.out.println("***** iteration elemnet*******");
for(Map.Entry m:hm.entrySet())
{
    System.out.println(m.getKey()+" "+m.getValue());
}


System.out.println( "keys: " +hm.keySet());
System.out.println("values: " +hm.values());

        
    }
}