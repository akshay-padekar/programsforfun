import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankSolutionDay7 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if (n>=1 && n<=1000) {
            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            boolean flag=true;
            
            for(String str : arrItems) {
                int in = Integer.parseInt(str);
                if(!(in >=1 && in<=10000)) {
                    flag=false;
                }
            }
            
            if (flag) {
                for (int i = 0; i < n; i++) {
                    int arrItem = Integer.parseInt(arrItems[i]);
                    if (arrItem >= 1 && arrItem <= 10000) {
                        arr[i] = arrItem;
                    }
                }

                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
        

        scanner.close();
    }
}
