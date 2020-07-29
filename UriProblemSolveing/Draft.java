
package UriProblemSolveing;

import static java.lang.Math.round;
import java.util.Scanner;


public class Draft {

 public static void main(String[] args) {


 Scanner s = new Scanner(System.in);
     double N = s.nextDouble();
     //01516069376
     int note = (int)N;
     double coin = N-note;
     int amount;
     System.out.println("NOTAS:");
     
     amount=note/100;
     note=note%100;
     System.out.println(amount+" nota(s) de R$ 100.00");
     
     amount=note/50;
     note=note%50;
     System.out.println(amount+" nota(s) de R$ 50.00");
     
     amount=note/20;
     note=note%20;
     System.out.println(amount+" nota(s) de R$ 20.00");
     
     amount=note/10;
     note=note%10;
     System.out.println(amount+" nota(s) de R$ 10.00");
     
     amount=note/5;
     note=note%5;
     System.out.println(amount+" nota(s) de R$ 5.00");
     
     amount=note/2;
     note=note%2;
     System.out.println(amount+" nota(s) de R$ 2.00");

     coin=coin+note;
     System.out.println("MOEDAS:");
     
     amount=(int)coin/1;
     coin=coin%1;
     System.out.println(amount+" moeda(s) de R$ 1.00");
     
     amount=(int)(coin/(.50));
     coin=coin%.50;
     System.out.println(amount+" moeda(s) de R$ 0.50");
     
     amount=(int)(coin/(.25));
     coin=coin%.25;
     System.out.println(amount+" moeda(s) de R$ 0.25");
     
     amount=(int)(coin/(.10));
     coin=coin%.10;
     System.out.println(amount+" moeda(s) de R$ 0.10");
     
     amount=(int)(coin/(.05));
     coin=coin%.05;
     System.out.println(amount+" moeda(s) de R$ 0.05");
     
     System.out.println(round(coin/(.01))+" moeda(s) de R$ 0.01");
 
    }
 
}