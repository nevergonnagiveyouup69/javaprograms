import java.util.Scanner;

class s1 {

    public static void printarr(int a[], int b) {
        for (int i = 0; i < b; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void sum(int a[], int b) {

        for (int i = 0; i < b; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && current < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
        }
        printarr(a, b);
        return;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int b = sc.nextInt();
        System.out.println("enter elements:");
        int a[] = new int[100];
        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        sum(a, b);
    }
}