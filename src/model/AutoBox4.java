package model;

/**
 * @author raphaelmachadofreire
 * Enumerações, Autoboxing e Anotações Uma versão
 * Autoboxing / unboxing ocorre dentro de expressões
 * Capítulo 12 - Página 273
 */

public class AutoBox4 {
    public static void main(String args[]){

        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = dOb + iOb;
        System.out.println("dOb após a expressão: " + dOb);
    }
}
