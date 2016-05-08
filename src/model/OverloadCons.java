package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Box define 3 construtores para inicializar as dimensões de uma caixa de várias maneiras
 * Capítulo 7 - Página 133
 */

public class OverloadCons {
    
    public static void main(String args[]){
    
        // criar caixas usando os diversos construtores
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        
        double vol;
        
        // obter o volume da primeira caixa
        vol = mybox1.volume();
        System.out.println("O volume de mybox1 é " + vol);
        
        // obter o volume da segunda caixa
        vol = mybox2.volume();
        System.out.println("O volume de mybox2 é " + vol);
        
        // obter o volume do cubo
        vol = mycube.volume();
        System.out.println("O volume de mycube é " + vol);
    }
    
}
