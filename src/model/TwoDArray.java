package model;

/**
 * @author raphaelmachadofreire
 * Array Multidimensionais
 * Demonstra um Array bidimensional
 * Capítulo 3 - Página 54
 */

/*
 * Em Java, os Arrays multidimensionais são Arrays de Arrays
*/


public class TwoDArray {
    
    public static void main(String[] args) {
        
        int twoD[][] = new int [4][5];
        // indice da esquerda determina a linha
        // indice da direita determina a coluna
        
        int i, j, k = 0;
        
        for(i=0; i<4; i++)
            for(j=0; j<5; j++){
            twoD[i][j] = k;
            k++;
        }
        
        for(i=0; i<4; i++){
            for(j=0; j<5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
     
    }
    
}
