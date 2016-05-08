package model;

/**
 * @author raphaelmachadofreire
 * Array Unidimensionais
 * Capítulo 3 - Página 51 e 52
 */


/*
 * Definição: Um array unidimensional é uma lista de variáveis do mesmo tipo.
 * Para criar um array, primeiro você deve criar uma variável de array do tipo 
 * desejado. A forma geral de uma declaração de array unidimensional é:
 * 
 * tipo nome-variável[];
 */


public class Array {
    
    public static void main(String[] args) {
        
        int month_days[];
        month_days = new int[12];
        
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        
        System.out.println("Abril tem: " + month_days[3] + " dias.");
    
    }
    
}
