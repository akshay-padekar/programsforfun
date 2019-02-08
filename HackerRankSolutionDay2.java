import java.util.Scanner;
import java.text.DecimalFormat;

public class HackerRankSolutionDay2 {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        DecimalFormat df = new DecimalFormat(".#");
        int meal_total_cost, mtc_int;
        double tip, tax, mtc, mtc_franction, formatted_mtc_franction;
        
        tip = meal_cost  * ((double) tip_percent/100);
        tax = meal_cost * ((double) tax_percent/100);
        
        mtc = meal_cost + tip + tax;
        mtc_int = (int) mtc;
        
        mtc_franction = mtc - mtc_int;
        
        formatted_mtc_franction = Double.parseDouble(df.format(mtc_franction)) ;
        
        if( formatted_mtc_franction < 0.5) {
            meal_total_cost = mtc_int;
        } else {
            meal_total_cost = mtc_int + 1;    
        }
        
        System.out.println("The total meal cost is "+ meal_total_cost +" dollars.");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
