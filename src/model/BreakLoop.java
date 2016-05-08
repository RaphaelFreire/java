package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Utilizando break para sair de um loop.
 * Capítulo 5 - Página 102
 */

public class BreakLoop {
    
    public static void main(String args[]){
        
        for(int i = 0; i < 100; i++){
            if(i == 10) break; //terminar o loop se i é igual a 10
            System.out.println("i: " + i);
        }
        
        System.out.println("Loop concluído.");
    }
}
