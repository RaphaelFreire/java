package model;

/**
 * @author raphaelmachadofreire
 * Instruções às classes
 * Este programa usa um método parametrizado.
 * Capítulo 6 - Página 120
 */

public class BoxDemo5 {
    
    public static void main(String args[]){
        
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        
        // inicializando cada caixa
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        
        // obter o volume da primeira caixa
        vol = mybox1.volume();
        System.out.println("O volume é " + vol);
        
        // obter o volume da segunda caixa
        vol = mybox2.volume();
        System.out.println("O volume é " + vol);
        
    }
}
