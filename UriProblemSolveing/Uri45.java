
package UriProblemSolveing;

import java.util.Scanner;

public class Uri45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end, duration;
        start= input.nextInt();
        end= input.nextInt();
        duration= end-start;
        if(duration<0){
            duration=24+(end-start);
       
        }            
       if(start==end)
       {
           System.out.printf("O JOGO DUROU 24 HORA(S)\n");
       }
       else
       {
           System.out.printf("O JOGO DUROU %d HORA(S)\n",duration);
       }
                
                    
                
    }
    
}
