import java.util.*;

class s1 {
    public static int first = -1;
    public static int last = -1;

    public static void print(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        print(str, idx + 1, element);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String a = sc.nextLine();
        System.out.println("enter the char");
        String b = sc.next();
        char c = b.charAt(0);
        print(a, 0, c);

    }
}
