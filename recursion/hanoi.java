import java.util.*;

class s1 {

    public static void print(int a, String src, String helper, String dest) {
        if (a == 1) {
            System.out.println("transfer disk " + a + " from " + src + " to " + dest);
            return;
        }
        print(a - 1, src, dest, helper);
        System.out.println("transfer disk " + a + " from " + src + " to " + dest);
        print(a - 1, helper, src, dest);

    }

    public static void main(String args[]) {

        int a = 2;
        Scanner sc = new Scanner(System.in);
        print(a, "S", "H", "D");

    }
}