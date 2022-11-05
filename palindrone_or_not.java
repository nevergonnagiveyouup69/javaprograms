import java.util.Scanner;

class s1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = a;
        if (a == 0) {
            System.out.println("string is a palindrone");
        } else {
            int b = 0, temp;
            while (a != 0) {
                temp = a % 10;
                b = b * 10 + temp;
                a /= 10;
            }
            if (b == c) {
                System.out.println("it is pal");
            } else {
                System.out.println("not pal");
            }
        }
        return;
    }
}