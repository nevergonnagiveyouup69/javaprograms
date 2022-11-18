import java.util.*;

class s1 {

    public static int sum(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int pownm1 = sum(x, n - 1);//decreases the n value
        int xpown = x * pownm1;//takes value of x and multiplies it
        return xpown;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value:");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = sum(x, n);
        System.out.println(ans);
    }
}
