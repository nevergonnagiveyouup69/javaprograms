import java.util.*;

class s1 {

    public static void print(String a, String per, int idx) {

        if (a.length() == 0) {
            System.out.println(per);
            return;
        }
        for (int i = 0; i < a.length(); i++) {
            char currchar = a.charAt(i);
            // System.out.println("debug 0 , i substring: " + a.substring(0, i));
            // System.out.println("debug i+1 substring: " + a.substring(i + 1));
            String newstr = a.substring(0, i) + a.substring(i + 1);
            print(newstr, per + currchar, idx + 1);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value:");
        String a = sc.next();
        print(a, "", 0);

    }
}