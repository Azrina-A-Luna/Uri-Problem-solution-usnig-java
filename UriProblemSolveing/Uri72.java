
package UriProblemSolveing;

import java.util.Scanner;

public class Uri72 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int n,i, x, in = 0, out = 0;

n = input.nextInt();

for (i=0; i<n; i++)
{
    x = input.nextInt();
    
    if(x>=10 && x<=20)
    {
        in++;
    }
    else
    {
        out++;
    }
}

        System.out.printf("%d in\n",in);
        System.out.printf("%d out\n",out);

        
        }
    
}
