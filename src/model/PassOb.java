package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Utilizando Objetos como parâmetros
 * Capítulo 7 - Página 134
 */

// Objetos podem ser transmitidos para métodos
class Test{
    int a, b;
    
    Test(int i, int j){
        a = i;
        b = j;
    }
    
    // retornar true se o for igual ao objeto chamador
    
    boolean equals(Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }

}

public class PassOb {
    
    public static void main(String args[]){
    
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        
        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));
        
    }
    
}
