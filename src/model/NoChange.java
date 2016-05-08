package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Demonstrando loop for-each que é, essencialmente, somente de leitura.
 * Capítulo 5 - Página 98
 */

public class NoChange {
    
    public static void main(String args[]){
    
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for(int x : nums){
            System.out.print(x + " ");
            x = x * 10; // sem efeito sobre nums
        }
        
        System.out.println();
        
        for(int x : nums){
            System.out.print(x + " ");
        
        }
    }
    
}
