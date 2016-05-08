package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Este programa contém um erro
 * Capítulo 5 - Página 105
 */

public class BreakErr {
    
    public static void main(String args[]){
    
        one: for(int i = 0; i < 3; i++){
            System.out.print("Passar " + i + ": ");
        }
        
        for(int j = 0; j < 100; j++){
//            if(j == 10) break one; // ERRADO
            System.out.print(j + " ");
        }
    }
}

/*  
    Como o loop rotulado como one não contém a instrução break,
    não é possível transferir o controle para este bloco. 
*/