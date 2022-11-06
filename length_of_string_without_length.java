import java.util.Scanner;

class s1 {

    public static void sum(String a) {
        int count = 0;
        for (char c1 : a.toCharArray()) {// coverts string to arr
            count++;
        }
        System.out.println(count);
        return;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements:");
        String a = sc.next();
        sum(a);
    }
}