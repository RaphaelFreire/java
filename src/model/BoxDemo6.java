package model;

/**
 * @author raphaelmachadofreire
 * Instruções às classes
 * Box usa o construtor para inicializar as dimensões de uma caixa
 * Capítulo 6 - Página 122
 */

public class BoxDemo6 {
    
    public static void main(String args[]){
    
        //declarar, alocar e inicializar objetos Box
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        double vol;
        
        //obter o volume da primeira caixa
        vol = mybox1.volume();
        System.out.println("O volume é " + vol);
        
        //obter o volume da segunda caixa
        vol = mybox2.volume();
        System.out.println("O volume é " + vol);
    
    }
    
}
