
package UriProblemSolveing;

import java.util.Scanner;

public class Uri443 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int even=0, odd=0, positive=0, negative=0, i,n;
     
     for(i=1; i<=5; i++)
     {
        n= input.nextInt();
        if(n%2==0)
        {
             even = even+1;
        }
     if(n%2!=0)
     {
         odd+=1;
     }
     if(n>0)
             {
              positive+=1;
                      
             }
     if(n<0)
             {
                 negative+=1;
             }
        
     }
        System.out.printf("%d valor(es) par(es)\n", even);
        System.out.printf("%d valor(es) impar(es)\n", odd);
        System.out.printf("%d valor(es) positivo(s)\n", positive);
        System.out.printf("%d valor(es) negativo(s)\n", negative);
    
    }
    
}

