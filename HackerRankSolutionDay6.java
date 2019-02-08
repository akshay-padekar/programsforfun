import java.io.*;
import java.util.*;

public class HackerRankSolutionDay6 {
    public static void main(String[] args) {
        String str_arr[] = null;
        char tmp_char_arr[];
        StringBuilder sb_even;
        StringBuilder sb_odd;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        str_arr = new String[N];
        s.nextLine();
        
        int i = 0;
        
        for(i=0;i<N;i++) { 
            
            str_arr[i] = s.next();
            s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            tmp_char_arr = str_arr[i].toCharArray();
            
            sb_even = new StringBuilder();
            sb_odd = new StringBuilder();
            for(int j=0; j<tmp_char_arr.length; j++) {
                if(j%2 ==0) {
                    sb_even.append(tmp_char_arr[j]);
                } else {
                    sb_odd.append(tmp_char_arr[j]);
                }
            }
            
            System.out.println(sb_even+" "+sb_odd);
        }
       
    }
}
