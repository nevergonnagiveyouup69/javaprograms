import java.util.Scanner;

class s1 {

    public static void sum(String a) {
        int[] b = new int[100];
        for (int i = 0; i < a.length(); i++) {
            b[i] = Integer.valueOf(a.charAt(i));// reads the char and stores in arr
            System.out.print(b[i] + " ");
        }
        return;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements:");
        String a = sc.next();
        sum(a);
    }
}