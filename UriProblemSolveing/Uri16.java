
package UriProblemSolveing;

import java.util.Scanner;


public class Uri16 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int a, result;
        a=input.nextInt();
        
        result=(int) (a/((90/60.0)-(60/60.0)));
        System.out.printf("%d minutos\n", result);
        
    }

    }
