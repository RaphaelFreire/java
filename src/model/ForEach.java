package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Usar um loop for em estilo for-each
 * Capítulo 5 - Página 97
 */

public class ForEach {
    
    public static void main(String args[]){
    
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        
        // usar o estilo for-each para exibir e somar os valores
        
        for(int x: nums){
            System.out.println("O valor é : " + x);
            sum += x;
        }
        
        System.out.println("Soma: " + sum);
    }
}
