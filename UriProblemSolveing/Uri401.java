
package UriProblemSolveing;

import java.util.Scanner;


public class Uri401 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int  i, positive=0;
double x;

for(i=1; i<=6; i++)
{
    x=input.nextDouble();
    if(x>=0)
    {
        positive+=1;
    }           
}
        System.out.printf("%d valores positivos\n", positive);
    
    }
    
}
