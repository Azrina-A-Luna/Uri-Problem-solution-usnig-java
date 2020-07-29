
package UriProblemSolveing;

import java.util.Scanner;


public class Uri19 {
    public static void main(String[] args) {
                                  Scanner input = new Scanner(System.in);
            int n, min, hour ;
  n = input.nextInt();
        
           hour=n/3600;
      n=n%3600;
      
               min= n/60;
               n=n%60;
               
        System.out.printf("%d:%d:%d\n", hour,min,n);   
    }
}
