package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Demonstrar return
 * Capítulo 5 - Página 106
 */

public class Return {
    
    public static void main(String args[]){
        
        boolean t = true;
            
            System.out.println("Antes do retorno.");
                if(t) return; //retorno ao chamador
            
            System.out.println("Isto não será executado.");
    } 
}
