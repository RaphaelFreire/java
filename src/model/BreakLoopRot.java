package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Utilizando break rotulado para sair de loops aninhados.
 * Capítulo 5 - Página 104
 */

public class BreakLoopRot {
    
    public static void main(String args[]){
        
        outer: for(int i = 0; i < 3; i++){
            System.out.print("Passar " + i + " : ");
            
            for(int j = 0; j < 100 ; j++){
                if(j == 10) break outer;
                System.out.print(j + " "); 
            }
            System.out.println("Isto não será impresso");
        }
        System.out.println("Loops concluídos");
    }
}
