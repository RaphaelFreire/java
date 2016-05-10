package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Box permite que um objeto inicialize outro
 * Capítulo 7 - Página 135
 */

public class OverloadCons2 {
    
    public static void main(String args[]){
        //criar caixas usando os diversos construtores
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        
        Box myclone = new Box(mybox1);
        double vol;
        
        // obter o volume da primeira caixa
        vol = mybox1.volume();
        System.out.println("O volume do mybox1 é: " + vol);
        
        // obter o volume da segunda caixa
        vol = mybox2.volume();
        System.out.println("O volume do mybox2 é: " + vol);
        
        // obter o volume do cubo
        vol = mycube.volume();
        System.out.println("O volume do mycube é: " + vol);
        
        // obter o volume do clone de mybox1
        vol = myclone.volume();
        System.out.println("O volume do clone de mybox1 é: " + vol);
         
    }
}
