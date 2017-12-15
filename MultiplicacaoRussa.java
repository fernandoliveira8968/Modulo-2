package multiplicacaorussa;

import java.util.Scanner;

public class MultiplicacaoRussa {

    
   
    public static void main(String[] args) {
        int x,y;
        Scanner LerS = new Scanner (System.in);
        System.out.print("Indique o multiplicador");
        x = LerS.nextInt();
        System.out.print("Indique o multiplicando");
        y = LerS.nextInt();
        System.out.print("O primeiro número mostrado corresponde ao X e o segundo ao Y");
        System.out.println();
        System.out.print(x);
        System.out.println();
        System.out.print(y);
        System.out.println();
                
        
        while (x>1 && y>1){
         x=x/2;
         y=y*2;
         System.out.print(x+"\n");
          System.out.print(y+"\n");
          
          
    
          }

        
            
            
            
        
    }
    
    }

