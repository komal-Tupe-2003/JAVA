import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class friends {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of friends: ");
        int n = scanner.nextInt();

        // Creating a HashSet to store friend names
        HashSet<String> hs = new HashSet<>();

        // Reading and storing names in the HashSet
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of friend ");
            String friendName = scanner.next();
            hs.add(friendName);
        }

        
    // Displaying the stored names
        System.out.println("\nFriend Names stored in HashSet:");
        for (String friend : hs) {
            System.out.println("Friend: " + friend);
        }
    }
}
