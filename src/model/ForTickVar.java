package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Declarar uma váriavel de controle de loop dentro de for.
 * Capítulo 5 - Página 93
 */

public class ForTickVar {
   
    public static void main(String args[]){
    
        // aqui, n é declarada dentro do loop for
        for(int n = 10; n > 0; n--)
            System.out.println("tick " + n);
    
    }
}
