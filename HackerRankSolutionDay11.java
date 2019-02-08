import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankSolutionDay11 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
//        for (int l = 0; l < 6; l++) {
//            for(int m = 0; m <6 ; m++)
//            {
//                System.out.print(arr[l][m]+" ");
//            }
//            System.out.println();
//        }
        
        
        int sum[] = new int[16], count=0, max_sum = -100000000, lcl_sum = 0;
        for(int o = 0; o < 4; o++){
            for(int p = 0 ; p < 4; p++) {
//                sum[count] = arr[o][p] + arr[o][(p+1)] + arr[o][(p+2)] +
//                         arr[(o+1)][(p+1)] +
//                         arr[(o+2)][p] + arr[(o+2)][(p+1)] + arr[(o+2)][(p+2)];
                
                lcl_sum = arr[o][p] + arr[o][(p+1)] + arr[o][(p+2)] +
                                arr[(o+1)][(p+1)] +
                                arr[(o+2)][p] + arr[(o+2)][(p+1)] + arr[(o+2)][(p+2)];
                
//                System.out.print(" arr["+o+"]["+p+"] "+" = "+arr[o][p]);
//                System.out.print(" arr["+o+"]["+(p+1)+"] "+" = "+arr[o][p+1]);
//                System.out.print(" arr["+o+"]["+(p+2)+"] "+" = "+arr[o][p+2]);
//                System.out.print(" arr["+(o+1)+"]["+(p+1)+"] "+" = "+arr[o+1][p+1]);
//                System.out.print(" arr["+(o+2)+"]["+p+"] "+" = "+arr[o+2][p]);
//                System.out.print(" arr["+(o+2)+"]["+(p+1)+"] "+" = "+arr[o+2][p+1]);
//                System.out.print(" arr["+(o+2)+"]["+(p+2)+"] "+" = "+arr[o+2][p+2]+" SUM : "+sum[count]);
//                System.out.println();
//                count++;
                
                if(lcl_sum > max_sum)
                    max_sum = lcl_sum;
                
//                System.out.println(lcl_sum +" > "+max_sum + " result : "+ (lcl_sum > max_sum));
            }
        }
        
//        Arrays.sort(sum);
        
//        for (int k : sum) {
//            System.out.print(k+" ");
//        }
        
        System.out.println(max_sum);
        
        scanner.close();
    }
}
