import java.util.Scanner;

class s1 {

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter value");
            StringBuilder b = new StringBuilder(sc.next());
            b.delete(0, 2);
            b.append(" is ass");
            System.out.println(b);
            for (int i = 0; i < b.length() / 2; i++) {
                int front = i;
                int back = b.length() - 1 - i;

                char frontchar = b.charAt(front);
                char backchar = b.charAt(back);

                b.setCharAt(front, backchar);
                b.setCharAt(back, frontchar);
            }
            System.out.println(b);
        }
        return;
    }
}