
package UriProblemSolveing;

import java.util.Scanner;

public class Uri35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, ab, cd  ;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        ab = a+b;
        cd = c+d;
        
        
       if (b>c && d>a && cd>ab && c>0 && d>0 && a%2 == 0)
       {
           System.out.println("Valores aceitos");
       }
       else
       {
           System.out.println("Valores nao aceitos");
       }
       
    }
    
}
