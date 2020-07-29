
package UriProblemSolveing;

import java.util.Scanner;


public class Luna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name;
        double x, y, total;
        
        name=input.nextLine();
        
        x=input.nextDouble();
        y=input.nextDouble();
      
        
        total= (y*15)/100+x;
        System.out.printf("TOTAL = R$ %.2f\n",total);
       
        
        
    }
    
}
