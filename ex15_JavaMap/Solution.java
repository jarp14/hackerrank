//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String,Integer> phones = new HashMap<String,Integer>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phones.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (phones.containsKey(s)) {
                System.out.println(s+"="+phones.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}



