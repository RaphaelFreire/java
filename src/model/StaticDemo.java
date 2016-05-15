package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Dentro de main(), o método statoc callme() e a variável static b são acessados por meio do nome de sua classe Static
 * Capítulo 7 - Página 146
 */

public class StaticDemo {
        static int a = 42;
        static int b = 99;
        
        static void callme(){
            System.out.println("a = " + a);
        }
        
}

class StaticByName{
    public static void main(String args[]){
    
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }

}