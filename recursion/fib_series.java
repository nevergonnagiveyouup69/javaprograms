import java.util.*;

class s1 {

    public static void sum(int a, int b, int n) {

        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        sum(b, c, n - 1);

    }

    public static void main(String args[]) {

        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value:");
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        sum(a, b, n - 2);
    }
}