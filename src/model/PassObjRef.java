package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Os objetos são transmitidos por suas referências 
 * Capítulo 7 - Página 137
 */

class Test3{
    int a, b;
    
    Test3(int i, int j){
        a = i;
        b = j;
    }
    
    // transmitir um objeto
    void meth(Test3 o){
        o.a *= 2; 
        o.b /= 2; 
    }

}

public class PassObjRef {
    
    public static void main(String args[]){
        Test3 ob = new Test3(15, 20);
        
        System.out.println("ob.a e ob.b antes da chamada: " + ob.a + " " + ob.b);
        
        ob.meth(ob);
        
        System.out.println("ob.a e ob.b depois da chamda: " + ob.a + " " + ob.b);
         
    }
    
}
