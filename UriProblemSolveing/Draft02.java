
package UriProblemSolveing;

import java.util.Scanner;


public class Draft02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t, i, n;
        t=input.nextInt();
        for(i=1; i<=t; i++)
        {
         n=input.nextInt();
    
        if(n%2==0)
        {
            System.out.println("even");
        }
        else 
        {
            System.out.println("odd");
        }
            }  
    
    }
    
}
