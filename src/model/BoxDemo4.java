package model;

/**
 * @author raphaelmachadofreire
 * Instruções às classes
 * Utilizando método volume da Classe Box que retorna um valor
 * Capítulo 6 - Página 118
 */

public class BoxDemo4 {
    
    public static void main(String args[]){
        
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        double vol;
        
        // atribuir valor às variáveis de instâncias de mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        
        // atribuir valor às variáveis de instâncias de mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        
        // obter o volume da primeira caixa
        vol = mybox1.volume();
        System.out.println("O volume é " + vol);
        
        // obter o volume da segunda caixa
        vol = mybox2.volume();
        System.out.println("O volume é " + vol);
    }
}
