package model;

/**
 * @author raphaelmachadofreire
 * Operadores Aritméticos 
 * Demonstrar Incremento e Decremento
 * Capítulo 4 - Página 65
 */

public class IncDec {
    
    public static void main(String args[]){
        
        int a = 1;
        int b = 2;
        int c;
        int d;
        
        c = ++b;
        d = a++;
        c++;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
    }

}

// Estes operadores são únicos no sentido de que podem aparecer na forma pós-fixada ou na forma pré-fixada. 