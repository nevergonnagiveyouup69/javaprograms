import java.util.*;

class s1 {

    public static void sum(int i, int n, int sum) {

        if (i > n) {
            System.out.println(sum);
            return;
        }
        sum *= i;
        sum(i + 1, n, sum);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value:");
        int n = sc.nextInt();
        sum(1, n, 1);
    }
}