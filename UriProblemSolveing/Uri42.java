
package UriProblemSolveing;

import java.util.Scanner;


public class Uri42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, max=0, mid=0, min;
      
         a = input.nextInt();
          b = input.nextInt();
          c = input.nextInt();
          min = Math.min(a, Math.min(b, c));
          if (min == a) {
             mid =Math.min(b, c);
             max =Math.max(b, c);
          }
         if (min == b) {
           mid =Math.min(a, c);
           max =Math.max(a, c);
         }
         if (min== c) {
           mid = Math.min(a, b);
           max = Math.max(a, b);
         }
         System.out.print(min+"\n"+mid+"\n"+max+"\n\n");
         System.out.print(a+"\n"+b+"\n"+c+"\n");
    }
}
