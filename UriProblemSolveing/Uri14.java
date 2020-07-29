
package UriProblemSolveing;

import java.util.Scanner;


public class Uri14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, max;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        
         max = a;
         if(a < b || a < c);
         {
             if(b < c)
             {
               max = c;
              
             }
             else{
                max = b;
            }
         }
         System.out.printf("%d eh o maior\n",max);
         
        
    }
    
}
