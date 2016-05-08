package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Utilizando a vírgula para permitir que duas ou mais variáveis controlem o loop for.
 * Capítulo 5 - Página 94
 */

public class Comma {
    
    public static void main(String args[]){
        
        int a, b;
        
        for(a = 1, b = 4; a < b; a++, b--){
             
            System.out.println("a = " + a);
            System.out.println("b = " + b);
     
        }
    }   
}
