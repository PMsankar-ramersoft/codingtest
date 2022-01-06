import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class output {
  public static void main(String args[]) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    
    Scanner sc = new Scanner(System.in);
    String sub = sc.nextLine();
    int t = Integer.parseInt(sub);
    for (int i = 0; i < t; i++) {

      String[] input = sc.nextLine().split(" ");

      if (input[0].equals("Acquaintance")) {
        String friendName = input[1];
        Acquaintance acq = new Acquaintance(friendName);
        acq.getStatus();
      } else if (input[0].equals("Friend")) {
        String friendName = input[1];
        String homeTown = input[2];
        String gender = input[3];
        Friend frnd = new Friend(friendName, homeTown, gender);
        frnd.getStatus();
      } else if (input[0].equals("BestFriend")) {
        String friendName = input[1];
        String homeTown = input[2];
        String gender = input[3];
        String favoriteSong = input[4];
        BestFriend bf = new BestFriend(friendName, homeTown, gender, favoriteSong);
        bf.getStatus();
      }
    }
  }
}