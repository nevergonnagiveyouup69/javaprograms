import java.util.Scanner;

class s1 {

    // print array
    public static void printarr(int a[], int b) {
        for (int i = 0; i < b; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // sort
    public static void sum(int a[], int b) {

        for (int i = 0; i < b - 1; i++) {
            for (int j = 0; j < b - i - 1; j++) {
                // swap
                if (a[j] > a[j + 1]) {
                    int temp = a[j];// temp stores value and swaps with next element by replacing by zero
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
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