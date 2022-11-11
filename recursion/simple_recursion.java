import java.util.*;

class s1 {

    public static void sum(int n) {
        if (n == 0) {
            System.out.print(" " + n);
            return;
        }
        System.out.print(n + " ");
        sum(n - 1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value:");
        int n = sc.nextInt();
        sum(n);
    }
}