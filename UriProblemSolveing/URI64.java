
package UriProblemSolveing;

import java.util.Scanner;

public class URI64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double avg=0, sum=0, x;
    int i, positive=0;
    for(i=1; i<=6; i++)
{
    x=input.nextDouble();
    if(x>=0)
    {
        positive+=1;
        sum=sum+x;
    }           
}
    avg=sum/positive;
       System.out.printf("%d valores positivos\n", positive);
        System.out.printf("%.1f\n", avg);
    }
    
}
