import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HackerRankSolutionDay9 {

    
    static int factorial(int n) {
        System.out.println("NUM : " + n);
        System.out.println(n + " * factorial(" + n +"-1)" );
        if(n < 1)
            return 1;
        return n * factorial(n-1);
    }
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        System.out.println("Result : " + factorial(num));
        
        sc.close();
    }
}
