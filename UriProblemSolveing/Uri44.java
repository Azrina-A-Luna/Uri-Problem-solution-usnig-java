
package UriProblemSolveing;

import java.util.Scanner;

public class Uri44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        a= input.nextInt();
        b= input.nextInt();
        if (a%b==0 || b%a==0)
            
        {
            System.out.println("Sao Multiplos");
    }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
    
    
}
