import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Integer> L = new LinkedList<Integer>();
        for (int i=0; i<N; i++) {
            int value = sc.nextInt();
            L.add(value);
        }

        int Q = sc.nextInt();
        for (int i=0; i<Q; i++) {
            String action = sc.next();
            if (action.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                L.add(index, value);
            } else {
                int index = sc.nextInt();
                L.remove(index);
            }
        }

        sc.close();

        L.forEach(number -> System.out.print(number+" "));
        /*for (Integer n : L) {
            System.out.print(n+" ");
        }*/
    }
}

