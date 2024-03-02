import java.util.*;
class hashtable
{
public static void main(String args[])
{
Hashtable<String,String> ht = new Hashtable();
ht.put("8149632509" ,"komal");
ht.put("8149632508" ,"sana");
ht.put("8149632507" ,"sans");
ht.put("8149632506" ,"priti");

//System.out.println(ht);
System.out.println("ht");
        for (String number : ht.keySet()) {
            String name = ht.get(number);
            System.out.println("student number: " + number + ", student name: " + name);
}
}
}
