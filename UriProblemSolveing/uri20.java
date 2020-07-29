
package UriProblemSolveing;

import java.util.Scanner;


public class uri20 {
  public static void main(String[] args) {
                  Scanner input = new Scanner(System.in);
       int n, year, month;
  n= input.nextInt();
            year=n/365;
                 n=n%365;
       
        month=n/30;
        n=n%30;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)", year, month, n);
       
    }
    
}
