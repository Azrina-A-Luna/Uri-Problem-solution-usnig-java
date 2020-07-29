
package UriProblemSolveing;

import java.util.Scanner;

public class Uri73 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i, n;
        n = input.nextInt();
        
        for (i=1; i<=n; i++)
        {
            if(i%2 == 0)
            {
                System.out.printf("%d^2 = %d\n",i,i*i);
            }
        }
    }
}
