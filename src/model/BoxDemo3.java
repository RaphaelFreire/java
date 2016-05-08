package model;

/**
 * @author raphaelmachadofreire
 * Instruções às classes
 * Utilizando método da Classe Box
 * Capítulo 6 - Página 117
 */

public class BoxDemo3 {
    
    public static void main(String args[]){
        
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        // atribuir valores às variaveis de instância de mybox1
        mybox1.width = 10; 
        mybox1.height = 20;
        mybox1.depth = 15;
        
        // atribuir valores diferentes para instância de mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        
        // exibir o volume da primeira caixa
        mybox1.volume();
        
        // exibir o volume da segunda caixa
        mybox2.volume();
    
    }
}
