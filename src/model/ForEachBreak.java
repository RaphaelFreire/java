package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Usar break com um loop for em estilo for-each
 * Capítulo 5 - Página 98
 */

public class ForEachBreak {
    
    public static void main(String args[]){
    
        int sum = 0;
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        // usar for para exibir e somar valores
        
        for(int x: nums){
            System.out.println("o valor é: " + x);
        
            sum += x;
            
            if(x == 5) break; // parar o loop quando 5 for obtido
        }
        
        System.out.println("Soma dos 5 primeiros elementos: " + sum);
    
    }
}
