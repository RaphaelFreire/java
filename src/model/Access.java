package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Em uma hierarquia de classes, os membros privados permanecem privados à sua classe.
 * Este programa contém um erro e não será compilado.
 * Capítulo 8 - Página 163
 */


// Criar uma superclasse

class A2{
    
    int i; //public é o padrão
    private int j; //privado para A
    
    void  setij(int x, int y){
        i = x;
        j = y;
    }
}

// O j de A não está acessível.
class B2 extends A2{
    
    int total;
    
    void sum(){
      //  total = i + j; // Erro, j não está acessível aqui 
    }
}


public class Access {
    public static void main(){
        
        B2 subOb = new B2();
        subOb.setij(10, 12);
        
        subOb.sum();
        
        System.out.println("Total é " + subOb.total);
        
    }
}
