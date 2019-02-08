// Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.util.Objects;

class HackerRankSolutionDay8_copy {

    public static void main(String[] argh) throws IOException {

        String readLine[];
        
        Map<String, Integer> dictionary = new HashMap<String, Integer>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
           
            readLine = br.readLine().split(" ");
            String name = readLine[0];
            int phone = Integer.parseInt(readLine[1]);
            // Write code here
            dictionary.put(name, phone);
//            System.out.println(name + " -- " + phone);
        }
        
        String stream, key = null;
        
        int val = 0;
        
        
        while((stream = br.readLine()) != null) {
            boolean match = false;
            
            if(dictionary.containsKey(stream)) {
                System.out.println(stream+"="+dictionary.get(stream));
            } else {
                System.out.println("not found");
            }
            
//            System.out.println("PRINT: "+stream);
//            for (Map.Entry<String, Integer> mk : dictionary.entrySet()) {
//                if(stream.equalsIgnoreCase(mk.getKey())) {
//                    match = true;
//                    key = mk.getKey();
//                    val = mk.getValue();
////                    System.out.println("KEY : "+key+" VAL : "+val);
//                }
//            }
            
//            if (match) {
//                System.out.println(key + "=" + val);
//            } else {
//                System.out.println("Not found");
//            }
        }

//        while (br.ready()) {
//            String s = br.readLine();
//            // Write code here
//
//            String key = null;
//            int val = 0;
//            boolean match = false;
//
//            for (Map.Entry<String, Integer> mk : dictionary.entrySet()) {
//                if (s.equalsIgnoreCase(mk.getKey())) {
//                    match = true;
//                    key = mk.getKey();
//                    val = mk.getValue();
//                }
//            }
//
//            if (match == true) {
//                System.out.println(key + "=" + val);
//            } else {
//                System.out.println("Not found");
//            }
//        }

        br.close();
    }
}
