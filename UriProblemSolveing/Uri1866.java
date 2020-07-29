
package UriProblemSolveing;

import java.util.Scanner;

public class Uri1866 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c,i,n;
        c=input.nextInt();
        for(i=1; i<=c; i++)
        {
            n=input.nextInt();
            if(n%2==0)
            {
                System.out.printf("0\n");
            }
            else
            {
                System.out.println("1");
            }
        }
        
    }
    
}
