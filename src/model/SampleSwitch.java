package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Um exemplo simples de switch
 * Capítulo 5 - Página 85
 */

public class SampleSwitch {

    public static void main(String args[]) {

        for (int i = 0; i < 6; i++) {

            switch (i) {

                case 0:
                    System.out.println("i é zero.");
                    break;

                case 1:
                    System.out.println("i é um.");
                    break;

                case 2:
                    System.out.println("i é dois.");
                    break;

                case 3:
                    System.out.println("i é três.");
                    break;

                default:
                    System.out.println("i é maior que 3.");

            }

        }

    }

}
