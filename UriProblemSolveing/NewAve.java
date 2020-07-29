
package UriProblemSolveing;

import java.util.Scanner;


public class NewAve {
    public static void main(String[] args) {
        
        double a, b, c, MEDIA;
        
        Scanner input = new Scanner(System.in);
        a= input.nextDouble();
        b= input.nextDouble();
        c= input.nextDouble();
        
        MEDIA = (a/10 * 2) + (b/10 * 3) + (c/10 * 5);
         String media = String.format("MEDIA = %,.1f", MEDIA);

        System.out.print(media +"\n");
        
    }
    
}
