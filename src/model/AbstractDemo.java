package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Uma demonstração simples de abstract
 * Capítulo 8 - Página 182
 */

abstract class A10{

    // métodos concretos ainda são permitidos em classes abstratas
    void callmetoo(){
        System.out.println("Este é um métodos concreto.");
    }
}

class B10 extends A10{
    void callme(){
        System.out.println("Implementação de callme em B.");
    }
}


public class AbstractDemo {
    public static void main(String[] args){
        B10 b = new B10();
        
        b.callme();
        b.callmetoo();
    }
}
