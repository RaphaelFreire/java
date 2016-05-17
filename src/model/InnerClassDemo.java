package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Demonstrar uma classe interna
 * Capítulo 7 - Página 149
 */

class Outer{

        int outer_x = 100;
        
        void test(){
            Inner inner = new Inner();
            inner.display();
        
        }
        
        
        //esta é uma classe interna
        class Inner{
            void display(){
                System.out.println("exibir: outer_x = " + outer_x );
            
            }
        }

}


public class InnerClassDemo {
    
    public static void main(String args[]){
        
        Outer outer = new Outer();
        outer.test();
    
    }
    
}
