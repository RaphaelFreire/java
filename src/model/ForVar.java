package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Partes do loop for que podem ser vazias.
 * Capítulo 5 - Página 94
 */

public class ForVar {
    
    public static void main(String args[]){
        
        int i;
        boolean done = false;
        
        i = 0;
        for( ; !done ; ){
            System.out.println("i is " + i);
            if(i == 10) done = true;
            i++;
        
        }
    }
}
