
package UriProblemSolveing;

import java.util.Scanner;


public class Uri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int A, B, C, D, difference;
        
        A=input.nextInt();
        B=input.nextInt();
        C=input.nextInt();
        D=input.nextInt();
        
       difference=((A * B) - (C *D));
        System.out.printf("DIFERENCA = %d\n", difference );
    }
    
}
