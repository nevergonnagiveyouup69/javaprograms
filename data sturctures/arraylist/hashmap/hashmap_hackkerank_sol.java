
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {
    public static void number(int n) {

        for (int i = 0; i < n; i++) {

        }
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = "";
        in.nextLine();
        HashMap<String, Integer> num = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            num.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            s = in.nextLine();
            if (num.containsKey(s)) {
                System.out.println(s + "=" + num.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}