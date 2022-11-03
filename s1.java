import java.util.Scanner;

class s1 {

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter email");
            String a = sc.next();
            String b = "";
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '@') {
                    break;
                } else {
                    b += a.charAt(i);
                }
            }
            System.out.println(b);
        }
        return;
    }
}
