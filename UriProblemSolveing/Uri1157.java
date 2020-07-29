
package UriProblemSolveing;

import java.util.Scanner;


public class Uri1157 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int n,i;
       n=input.nextInt();
       for(i=1; i<=n; i++)
       {
           if(n%i==0)
           {
               System.out.println(i);  
           }
       }
    }
    
}
