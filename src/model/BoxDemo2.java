package model;

/**
 * @author raphaelmachadofreire
 * Instruções às classes
 * Um programa que usa a classe box e declara dois objetos box
 * Capítulo 6 - Página 112
 */

public class BoxDemo2 {
    
    public static void main(String args[]){
    
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        double vol;
        
        // atribuir valores às váriaveis de instância de mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        
        // atribuir valores às váriaveis de instância de mybox1
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        
        // calcular o volume da primeira caixa
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("O volume é " + vol);
        
        // calcular o volume da segunda caixa
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("O volume é " + vol);
        
    }
}
