package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Utilizando break para sair de um loop while.
 * Capítulo 5 - Página 102
 */

public class BreakLoopWhile {
    
    public static void main(String args[]){
        int i = 0;
        
        while(i < 100){
            
            if(i == 10) break;
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop concluído.");
    }
    
}
