package model;

/**
 * @author raphaelmachadofreire
 * Operadores Aritméticos 
 * Deslocando à esquerda como modo rápido de multiplicar por 2
 * Capítulo 4 - Página 70
 */

public class MultByTwo {
    
    public static void main(String[] args) {
    
    int i;
    int num = 0xFFFFFFE;
    
        for(i = 0; i < 4; i++){
            num = num << 1;
            System.out.println(num);
        }
    }
    
}
