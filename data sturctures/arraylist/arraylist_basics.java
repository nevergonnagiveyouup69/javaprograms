import java.util.*;

class s1 {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(6);
        list.add(6);
        int a = 7;

        System.out.println(list);
        int element = list.get(0);
        System.out.println(element);

        list.add(0, 9);
        System.out.println(list);

        list.set(2, 9);
        System.out.println(list);

        list.remove(0);
        list.remove(2);
        System.out.println(list);

        list.add(2, a);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
    }
}