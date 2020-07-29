
package UriProblemSolveing;

import java.util.Scanner;


public class Uri15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2, result;
        x1=input.nextDouble();
        y1=input.nextDouble();
        x2=input.nextFloat();
        y2=input.nextDouble();
        
        result=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        
        System.out.printf("%.4f\n",result);
        
    }
    
}
