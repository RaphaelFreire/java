package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Criar uma superclasse
 * Capítulo 8 - Página 174
 */

// Criar uma superclasse
class A5{
    A5(){
        System.out.println("Dentro do construtor de A.");
    }
}

// Criar uma subclasse estendendo a classe A
class B5 extends A5{
    B5(){
        System.out.println("Dentro do construtor de B.");
    }
}

// Criar outra subclasse estendendo B
class C5 extends B5{
    C5(){
        System.out.println("Dentro do construtor de C.");
    }
}

public class CallingCons {
    public static void main(String[] args){
        C5 c = new C5();
    }
}
