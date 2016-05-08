package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Demonstrar o continue
 * Capítulo 5 - Página 105
 */

public class Continue {
    
    public static void main(String args[]){
        
        for(int i = 0; i < 10; i++){
            
            System.out.print(i + " ");
                if(i % 2 == 0) continue;
                System.out.println();
        
        }
    }
}
