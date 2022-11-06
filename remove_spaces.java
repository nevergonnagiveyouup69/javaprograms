import java.util.Scanner;

class s1 {

    public static void sum(String a) {
        StringBuffer b = new StringBuffer();
        char c[] = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if ((c[i] != ' ') && (c[i] != '\t')) {
                b.append(c[i]);
            }
        }
        System.out.println(b);
        return;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements:");
        String a = sc.nextLine();
        sum(a);
    }
}