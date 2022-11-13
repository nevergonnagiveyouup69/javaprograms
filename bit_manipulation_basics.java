import java.util.Scanner;

class s1 {

    public static void sum(int a) {
        int i = 0;
        int bitmask = 1 << i;
        int notbitmask = ~(bitmask);
        int newnumber = bitmask | a;
        System.out.println(bitmask + " " + notbitmask + " " + newnumber);
        return;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements:");
        int a = sc.nextInt();
        sum(a);
    }
}
