import java.util.Scanner;

class s1 {

    public static void sum(String a) {
        int b = 0;
        char c[] = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isDigit(c[i])) {            //checks if it is a digit or not
                b += Character.getNumericValue(c[i]); //find int value in string
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
