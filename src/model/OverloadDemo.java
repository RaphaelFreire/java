package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Demonstrar a sobrecarga de método.
 * Capítulo 7 - Página 129
 */

public class OverloadDemo {
    
    void test(){
        System.out.println("Sem parâmetros");
    }
    
    // Teste de sobrecarga para um parâmetro inteiro.
    void test(int a){
        System.out.println("a: " + a);
    }
    
    // Teste de sobrecarga para dois parâmetros inteiros.
    void test(int a, int b){
        System.out.println("a e b: " + a + " " + b);
    }
    
    // Teste de sobrecarga para um parâmetro double
    double test(double a){
        System.out.println("double a " + a);
        return a * a;
    }
}

class Overload{
    public static void main(String args[]){
    
        OverloadDemo ob = new OverloadDemo();
        double result;
        
        // chamar todas versões de teste()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        
        System.out.println("Resultado de ob.test(123.25): " + result);
    
    }
}