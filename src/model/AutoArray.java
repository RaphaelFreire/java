package model;

/**
 * @author raphaelmachadofreire
 * Array Unidimensionais
 * Uma versão melhorada do programa Array.java
 * Capítulo 3 - Página 53
 */


/*
 * Os Array podem ser inicializados quando são declarados. O processo é quase o 
 * mesmo que aquele usado para inicializar tipos simples. Um inicializar de arrays
 * é uma lista, encerrada por chaves, de expressões separadas por vírgulas.
 * As vírgulas separam os valores dos elementos do Array. O Array será criado 
 * automaticamente com tamanho suficiente para conter o número de elementos que 
 * você especificar no inicializador de Array. Não é preciso o new.
*/

public class AutoArray {
    public static void main(String[] args) {
        
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        System.out.println("Abril tem " + month_days[3] + " dias." );
    }
    
}
