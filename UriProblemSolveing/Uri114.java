
package UriProblemSolveing;

import java.util.Scanner;


public class Uri114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password;
        while(true)
        {
            password=input.nextInt();
            if(password==2002)
            {
                System.out.println("Acesso Permitido");
                break;
            }
            else{
                System.out.println("Senha Invalida");
            }
            
        }
    }
    
    
}
