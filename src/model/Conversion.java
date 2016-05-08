package model;

/**
 * @author raphaelmachadofreire
 * Demonstra conversões explicitas
 * Capítulo 3 - Página 49 
 */

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        
        System.out.println("\nConversão de int para byte.");
        b = (byte) i;
        System.out.println("i e b " + i + " " + b);
        
        System.out.println("\nConversão de double para int.");
        i = (int) d;
        System.out.println("d e i " + d + " " + i);
        
        System.out.println("\nConversão de double para byte.");
        b = (byte) d;
        System.out.println("d e b " + d + " " + b);
    }
}

/*
 * Quando o valor 257 é convertido em uma variável byte, o resultado é o resto
 * da divisão de 257 por 256 (a faixa de um byte), que neste caso é 1.
 * 
 * Quando d é convertido em um int, seu componente fracionário é perdido.
 *  
 * Quando d é convertido em um byte, seu componente fracionario é perdido e o valor
 * é reduzido em módulo 256, que neste caso é 67.
 */

