import java.util.*;

class s1 {

    public static void print(String str, int idx, int count, String newString) {

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += "x";
            }
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == 'x') {
            count++;
            print(str, idx + 1, count, newString);
        } else {
            newString += currchar;
            print(str, idx + 1, count, newString);
        }

    }

    public static void main(String args[]) {

        Scanner a = new Scanner(System.in);
        System.out.println("enter string");
        String b = a.next();
        print(b, 0, 0, "");

    }
}