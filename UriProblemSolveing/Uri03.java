
package UriProblemSolveing;

import java.util.Scanner;


public class Uri03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pc;
        double pu, pp, total; 
         
        pc=input.nextInt();
        
        pu= input.nextDouble();
        
        pp= input.nextDouble();
        total= pu*pp;
       
        pc=input.nextInt();
        
        pu= input.nextDouble();
        
       pp= input.nextDouble();
       
       total += pu* pp;
       
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
       
       
    }
    
}
