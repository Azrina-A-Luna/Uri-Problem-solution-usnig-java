
package UriProblemSolveing;

import java.util.Scanner;


public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int x, y;
    double z;
    
    x= input.nextInt();
    y= input.nextInt();
    
    z=input.nextDouble();
    
        System.out.printf("NUMBER = %d\n", x);
        System.out.printf ("SALARY = U$ %.2f\n", y*z);
    }
    
}
