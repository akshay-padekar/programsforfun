// Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.util.Objects;

class HackerRankSolutionDay8 {

    public static void main(String[] argh) {

        Map<String, Integer> dictionary = new HashMap<String, Integer>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            dictionary.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.next();
            // Write code here

            String key = null;
            int val = 0;
            boolean match = false;

            for (Map.Entry<String, Integer> mk : dictionary.entrySet()) {
                if (s.equalsIgnoreCase(mk.getKey())) {
                    match = true;
                    key = mk.getKey();
                    val = mk.getValue();
                }
            }

            if (match == true) {
                System.out.println(key + "=" + val);
            } else {
                System.out.println("Not found");
            }
        }


        in.close();
    }
}
