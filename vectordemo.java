import java.util.*;
class vectordemo
{
    public static void main(String args[])
    {
        
        Vector vector = new Vector();
        
        vector.add("jai");
        vector.add("krushna");
        vector.add("dipa");
        vector.add("rupa");

        //duplicate elements are allowed in vector
        vector.add("rupa");

        //adding first element in vector
        vector.addFirst("kalynai");
        System.out.println(vector);

        vector.remove("krushna");
        System.out.println(vector);

    //element is present or not
    if(vector.contains("kalynai"))
    {
       System.out.println(" element is present in vector");
    }
    else
    {
        System.out.println("element is not present in vector");
    }


// for sorting of the vector
Collections.sort(vector);
System.out.println(vector);
        
    }
}