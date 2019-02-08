import java.util.Scanner;

public class HackerRankSolutionDay10 {

    private static char[] convertToBinary(int num) {
        StringBuffer sb = new StringBuffer();
        int rem = 0, quo, lcl_num = num;
        
        quo = lcl_num/2;
        
        while(quo != 0) {
            quo = lcl_num/2;
            rem = lcl_num%2;
            lcl_num = quo;
            sb.append(rem);
        }
        return sb.reverse().toString().toCharArray();
        
//        StringBuffer sb = new StringBuffer("100000111100011100000111111111100110111");
//        return sb.reverse().toString().toCharArray();
    }
    
    private static final Scanner scanner = new Scanner(System.in);
//    1245789   100110000001001011101
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        char[] binStr = convertToBinary(n);
        
        int curr_count = 0, max_count = 0 ;
        
        for(char c : binStr) {
          if(Character.getNumericValue(c) == 1) {
              curr_count++;
              if(max_count < curr_count)
                  max_count = curr_count;
//              max_count = curr_count;
//              System.out.println("curr_count++ : "+curr_count);
          } else if (Character.getNumericValue(c) == 0) {
              if(max_count < curr_count)
                  max_count = curr_count;
              curr_count = 0;
          }
//          System.out.println("max_count : "+max_count);
        }
        
//        for(int i = 0; i < binStr.length() ; i++) {
//            System.out.println("STRING : "+binStr.charAt(i));
//            if(binStr.charAt(i) == 1) {
//                curr_count++;
//            } else if (binStr.charAt(i) == 0) {
//                if(max_count < curr_count)
//                    max_count = curr_count;
//                curr_count = 0;
//            }
//        }
        
        System.out.println(max_count);
        
        scanner.close();
    }
}
