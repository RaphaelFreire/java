package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Demonstrar o loop do-while
 * Capítulo 5 - Página 90
 */

public class DoWhile {
    
    public static void main(String args[]){
    
        int n = 10;
        
        do{
            System.out.println("tick " + n);
            n--;
        }while(n > 0);
    }
}
