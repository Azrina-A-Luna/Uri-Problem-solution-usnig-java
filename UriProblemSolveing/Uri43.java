
package UriProblemSolveing;

import java.util.Scanner;


public class Uri43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         double a, b, c, perimeter, area;
         a=input.nextDouble();
         b=input.nextDouble();
         c=input.nextDouble();
        if(a<(b+c) && b<(a+c) && c<(a+b))
        {
            perimeter=a+b+c;
            System.out.printf("Perimetro = %.1f\n", perimeter);
        }
    
    else
        {
            area= ((a+b)*c)/2;
            System.out.printf("Area = %.1f\n",area);
          
        }
    
    }
   
}
