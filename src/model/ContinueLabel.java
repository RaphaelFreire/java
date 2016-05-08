package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Demonstrar o continue com um rótulo
 * Capítulo 5 - Página 106
 */

public class ContinueLabel {
 
    public static void main(String args[]){
        
        outer:
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 10; j++){
                    
                    if(j > i){
                        System.out.println();
                        continue outer;
                    }
                    System.out.print(" " + (j * i));
                }
            }
            System.out.println();
    }
}
