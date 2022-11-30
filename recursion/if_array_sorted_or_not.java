import java.util.*;

class s1 {

    public static void print(int arr[], int idx) {

        if (arr[idx] == arr.length - 1) {
            System.out.println("true");
            return;
        }
        if (arr[idx] < arr[idx + 1]) {
            print(arr, idx + 1);
        } else {
            System.out.println("false");
            return;
        }

    }

    public static void main(String args[]) {

        int a[] = { 1, 5, 2 };
        print(a, 0);

    }
}