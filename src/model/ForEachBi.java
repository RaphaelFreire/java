package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Usar o for-each em um array bidimensional.
 * Capítulo 5 - Página 99
 */

public class ForEachBi {

    public static void main(String args[]) {

            int sum = 0;
            int nums[][] = new int[3][5];

            // atribuir alguns valores a nums
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    nums[i][j] = (i + 1) * (j + 1);
                }
            }

            // usar o for for-each para exibir e somar os valores
            for (int x[] : nums) {
                for (int y : x) {
                    System.out.println("O valor é: " + y);
                    sum += y;
                }
            }
        System.out.println("Soma: " + sum);
    }
}
