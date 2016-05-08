package model;

/**
 * @author raphaelmachadofreire
 * Operadores Aritméticos 
 * Deslocando um valor byte à esquerda
 * Capítulo 4 - Página 69
 */

public class ByteShift {
    
    public static void main(String[] args) {
        
        byte a = 64, b;
        int i;
        
        i = a << 2;
        b = (byte) (a << 2);
        
        System.out.println("Valor original de a: " + a);
        System.out.println("i e b: " + i + " " + b);
        
    }
    
}


// O operador de deslocamento à esquerda (<<), desloca todos os bits 
// de uma valor para a esquerda por um número específico de vezes. Forma geral: valor << num