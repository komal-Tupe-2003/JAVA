import java.util.*;
class treemap1
{
    public static void main(String args[])
    {
        TreeMap<Integer,String> tm = new TreeMap();
        tm.put(1,"komal");
        tm.put(8,"sita");
        tm.put(9,"sans");
        tm.put(4,"sana");

       
System.out.println(tm);

//for getting values from hashmap
System.out.println(tm.get(4));

System.out.println(tm.remove(4));

// for iteration
System.out.println("***** iteration elemnet*******");
for(Map.Entry m:tm.entrySet())
{
    System.out.println(m.getKey()+" "+m.getValue());
}


System.out.println( "keys: " +tm.keySet());
System.out.println("values: " +tm.values());

        
    }
}