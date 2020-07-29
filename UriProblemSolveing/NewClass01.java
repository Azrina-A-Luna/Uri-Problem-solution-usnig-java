
package UriProblemSolveing;

import java.util.Scanner;
public class NewClass01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a, b, c, max, min;
         a=input.nextInt();
         b=input.nextInt();
         c=input.nextInt();
         
         int d = Math.min(a, b);
        // min = Math.min(c,d);
        min = Math.min(c, Math.min(a,b));
         System.out.println("min : "+min);
       
     
           max= Math.max(a,b);
            System.out.println("max : "+max);
                
                
                
                
                
    }
    
}
