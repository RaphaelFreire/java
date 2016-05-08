package model;

/**
 * @author raphaelmachadofreire
 * Operadores Aritméticos 
 * Demonstra ternário '?', usado para obter o valor absoluto de uma variável
 * Capítulo 4 - Página 77
 */

public class Ternary {
    
    public static void main(String[] args) {
        
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; // true : false
        System.out.print("O valor absoluto de ");
        System.out.println(i + " é " + k);
        
        
        i = -10;
        k = i < 0 ? -i : i; // obter o valor absoluto de i
        System.out.print("O valor absoluto de ");
        System.out.println(i + " é " + k);
    }
    
}
