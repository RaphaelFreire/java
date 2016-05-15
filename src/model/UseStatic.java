package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Demonstrar variáveis, métodos e bloco static
 * Capítulo 7 - Página 145
 */

public class UseStatic {
    
    static int a = 3;
    static int b;
    
    static void meth(int x){
    
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
    
    static {
        System.out.println("Bloco static inicializado.");
        b = a * 4;
    }
    
    public static void main(String args[]){
        meth(42);
    }
    
}
