
package UriProblemSolveing;

import java.util.Scanner;


public class Uri38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        double price = 0;
        x=input.nextInt();
        y=input.nextInt();
        
        if(x == 1)
        {
            price = 4.00*y;
        }
        else if(x == 2)

        {
            price = 4.50*y;
        }
    
        else if(x == 3)
        {
            price= 5.00*y;
        }
        else if(x == 4)
        {
         price = 2.00*y;
         
        }
        else if(x == 5)
        {
            price=1.50*y;
        }
    
        System.out.printf("Total: R$ %.2f\n",price);
    
    }
}
