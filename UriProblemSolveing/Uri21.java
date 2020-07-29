
package UriProblemSolveing;

import java.util.Scanner;

public class Uri21 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double a;
a=input.nextDouble();
    System.out.printf("NOTAS:\n");


    System.out.printf("%d nota(s) de R$ 100.00\n",(int)a/10000 );
a=a%10000;   

  System.out.printf("%d nota(s) de R$ 50.00\n",(int)a/5000 );
a=a%5000;

  System.out.printf("%d nota(s) de R$ 20.00\n",(int)a/2000 );
a=a%2000;

  System.out.printf("%d nota(s) de R$ 10.00\n",(int)a/1000 );
a=a%1000;

  System.out.printf("%d nota(s) de R$ 5.00\n",(int)a/500 );
a=a%500;

  System.out.printf("%d nota(s) de R$ 2.00\n",(int)a/200 );
a=a%200;

 

 System.out.printf("MOEDAS:\n");


 
    System.out.printf("%d moeda(s) de R$ 1.00\n",(int)a/100);
    a=a%100;
    
 System.out.printf("%d moeda(s) de R$ 0.50\n",(int)(a/50.0));
    a=a%50.0;

     System.out.printf("%d moeda(s) de R$ 0.25\n",(int)(a/25.0));
    a=a%25.0;
    
     System.out.printf("%d moeda(s) de R$ 0.10\n",(int)(a/10.0));
    a=a%10.0;

      System.out.printf("%d moeda(s) de R$ 0.05\n",(int)(a/5.0));
    a=a%5.0;
    
      System.out.printf("%d moeda(s) de R$ 0.01\n",(int)a);
    

}
    
}
