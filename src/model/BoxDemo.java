package model;

/**
 * @author raphaelmachadofreire
 * Instruções às classes
 * Um programa que usa a classe box
 * Capítulo 6 - Página 111
 */

public class BoxDemo {
    
    public static void main(String args[]){
        
        Box mybox = new Box();
        double vol;
        
        // atribuir valores às variáveis de instancia de mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        
        // calcular o volume da caixa
        vol = mybox.width * mybox.height * mybox.depth;
        
        System.out.println("O volume é: " + vol);
       
    }
}
