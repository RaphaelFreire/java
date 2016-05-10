package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Tipos simples são transmitidos por valor
 * Capítulo 7 - Página 137
 */

class Test2{
    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }
}


public class CallByValue {
    public static void main(String args[]){
        Test2 ob = new Test2();
        int a = 15, b = 20;
        
        System.out.println("a e b antes da chamada: " + a + " " + b);
        
        ob.meth(a, b);
        
        System.out.println("a e b depois da chamada: " + a + " " + b);
    
    }
}
