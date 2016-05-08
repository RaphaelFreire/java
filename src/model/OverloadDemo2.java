package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Demonstrar as conversões automáticas de tipo se aplicam à sobrecarga
 * Capítulo 7 - Página 130
 */

public class OverloadDemo2 {
    
    void test(){
        System.out.println("Sem parâmetros");
    }
    
    // Teste de sobrecarga para dois parâmetros inteiros.
    void test(int a, int b){
        System.out.println("a e b: " + a + " " + b);
    }
    
    // Teste de sobrecarga para um parâmetro double
    void test(double a){
        System.out.println("Dentro de test(double) a: " + a);
    }
    
}

class Overload2{
    
    public static void main(String args[]){
    
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;
        
        ob.test();
        ob.test(10, 20);
        ob.test(i); // isto chamará test(double)
        ob.test(123.2); // isso chamará test(double)
    
    }
}
