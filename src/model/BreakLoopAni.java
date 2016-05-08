package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Utilizando break para sair de loops aninhados.
 * Capítulo 5 - Página 102
 */

public class BreakLoopAni {
    
    public static void main(String args[]){
        
        for(int i = 0; i < 3; i++){
            
            System.out.print("Transmitir " + i + " : ");
                
                for(int j = 0; j < 100; j++){
                    
                    if(j == 15) break; //terminar o loop se j for igual 10
                        System.out.print(j + " ");  
                }
                System.out.println();
        }
        System.out.println("Loops concluídos");
    }
}
