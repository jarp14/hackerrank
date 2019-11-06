import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] splitted = s.split("[ !,?._'@]+");
        System.out.println(splitted.length);
        for (String a : splitted) {
            System.out.println(a);
        }
        scan.close();
    }
}

