package model;

/**
 * @author raphaelmachadofreire
 * Instruções às classes
 * Box usa um construtor parametrizado para inicializar as dimensões de um caixa.
 * Capítulo 6 - Página 124
 */

public class BoxDemo7 {
    
    public static void main(String args[]){
        
        // declarar, alocar e inicializar os objetos box
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        
        double vol;
        
        //obter o volume da primeira caixa
        vol = mybox1.volume();
        System.out.println("O volume é " + vol);
        
        //obter o volume da segunda caixa
        vol = mybox2.volume();
        System.out.println("O volume é " + vol);
    }
    
}
