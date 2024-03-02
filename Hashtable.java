import java.util.*;
class hashtable
{
public static void main(String args[])
{
Hashtable<String,String> ht = new Hashtable();
ht.put("8149632509" ,"komal Tupe");
ht.put("8149632508" ,"saniya shaikh");
ht.put("8149632507" ,"sanskruti pawar");
ht.put("8149632506" ,"priti patil");

//System.out.println(ht);
System.out.println("ht");
        for (String number : ht.keySet()) {
            String name = ht.get(number);
            System.out.println("student number: " + number + ", student name: " + name);
}
}
}
