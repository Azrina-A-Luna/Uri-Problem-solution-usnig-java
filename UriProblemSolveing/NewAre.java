
package UriProblemSolveing;

import java.util.Scanner;


public class NewAre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B, C;
        A=input.nextDouble();
        B=input.nextDouble();
        C=input.nextDouble();
        System.out.printf("TRIANGULO: %.3f\n", (0.5*A*C));
        System.out.printf("CIRCULO: %.3f\n", C*C*3.14159);
        System.out.printf("TRAPEZIO: %.3f\n", ((A+B)/2)*C);
        System.out.printf("QUADRADO: %.3f\n", B*B);
        System.out.printf("RETANGULO: %.3f\n", A*B);
    }
    
}
