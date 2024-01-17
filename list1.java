import java.util.*;
import java.util.Scanner;
public class list1{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    ArrayList<String> l1 = new ArrayList();

    System.out.println("how many movie names you want");
    int n = sc.nextInt();
    for(int i=0; i<n; i++)
    {

    System.out.println("enter the movie names");
    String name =sc.next();

    l1.add( name);

    System.out.println(l1);


}
}
}