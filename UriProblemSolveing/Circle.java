
package UriProblemSolveing;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double R, volume;
        R=input.nextDouble();
        
        volume=(4/3.0)*3.14159*(R*R*R);
        
        System.out.printf("VOLUME = %.3f\n",volume);
    }
    
}
