
package UriProblemSolveing;

import java.util.Scanner;


public class Uri2936 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a, b, c, d, e, sum=0;
        a= input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e= input.nextInt();
        
        sum= sum+(a*300);
        sum= sum+(b*1500);
        sum=sum+(c*600);
        sum=sum+(d*1000);
        sum=sum+(e*150);
      sum=sum+225;
        System.out.println(sum);
                
        
    }
}
