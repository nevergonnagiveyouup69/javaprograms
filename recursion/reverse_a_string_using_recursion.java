import java.util.*;

class s1 {

    public static void print(String str, int l) {
        if (l == 0) {
            System.out.print(str.charAt(l));
            return;
        }
        System.out.print(str.charAt(l));
        print(str, l - 1);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String a = sc.nextLine();
        print(a, a.length() - 1);

    }
}