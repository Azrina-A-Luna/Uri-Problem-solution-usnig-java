
package UriProblemSolveing;

import java.util.Scanner;


public class Uri70 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  i, x;
        x = input.nextInt();
       for (i=x;i<=x+11;i++)
    {
        if (i%2 != 0)
        {
            System.out.println(i);
        }
    }

    }
}
