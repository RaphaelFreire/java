package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Um exemplo simples de herança
 * Capítulo 8 - Página 162
 */

//Criar uma superclasse
class A{
    int i, j;
    
    void showij(){
        System.out.println("i e j: " + i + " " + j);
    }
}

//Criar uma subclasse estendendo a classe A.
class B extends A{
    int k;
    
    
    void showk(){
        System.out.println("K: " + k);
    }
    
    void sum(){
        System.out.println("i + j + k: " + (i+j+k));
    }
}

public class SimpleInheritance {
    
    public static void main(String[] args){
        
        A superOb = new A();
        B subOb = new B();
        
        // A superclasse deve ser usada sozinha.
        superOb.i = 10;
        superOb.j = 20;
        
        System.out.println("Conteúdo de superOb: ");
        superOb.showij();
        System.out.println();
        
        /* A subclasse tem acesso a todos os membros públicos de sua superclasse. */
        
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        
        System.out.println("Conteúdo de subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        
        System.out.println("Soma de i,j e k em subOb:");
        subOb.sum();
 
    }
}
