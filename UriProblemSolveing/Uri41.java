
package UriProblemSolveing;

import java.util.Scanner;


public class Uri41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           
        double x, y;
         x = input.nextDouble();
         y = input.nextDouble();
        
        
        if(x==0 && y==0)
        {
            System.out.println("Origem");
        }
        else if(x==0)
        {
            System.out.println("Eixo Y");
        }
        else if(y==0)
        {
            System.out.println("Eixo X");
        }
        else if(x>0 && y>0)
        {
            System.out.println("Q1");
        }
        else if (x>0 && y<0)
        {
            System.out.println("Q4");
        }
        else if(x<0 && y>0)
        {
            System.out.println("Q2");
        }
        else 
        {
            System.out.println("Q3");
        }     
        
    }
    
}
