package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Buscar um array, usando o for-each
 * Capítulo 5 - Página 100
 */

public class Search {

    public static void main(String args[]) {

            int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};

            int val = 5;
            boolean found = false;

            //usar for-each para buscar numa array
            for (int x : nums) {
                if (x == val) {
                    found = true;
                    break;
                }
            }
        if(found)   
            System.out.println("Valor encontrado: " + val);
    }
}
