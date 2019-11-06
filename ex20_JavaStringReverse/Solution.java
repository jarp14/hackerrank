import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String aux = "";
        for (int i=A.length()-1; i>=0; i--) {
            aux = aux.substring(0)+A.charAt(i);
        }
        if (aux.equals(A)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}