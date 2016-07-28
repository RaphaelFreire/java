package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Usando super para superar a ocultação do nomes 
 * Capítulo 8 - Página 170
 */

class A3{
    int i;
}

class B3 extends A3{
    int i; // este i oculta o i de A
    
    B3(int a, int b){
        super.i = a; // i de A
        i = b; // i de B
    }
    
    void show(){
        System.out.println("i da superclasse: " + super.i);
        System.out.println("i da subclasse: " + i);
    }

}


public class UseSuper {
    
    public static void main(String[] args){
        B3 subOb = new B3(1, 2);
        subOb.show();
    
    }
    
}
