package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Este programa define uma classe interna de um loop for.
 * Capítulo 7 - Página 151
 */

class Outer3{

    int outer_x = 100;
    
    void test(){
        
        for(int i = 0; i < 10 ; i++){
            
            class Inner{
                
                void display(){
                    System.out.println("exibir: outer_x = " + outer_x);
                }
                
            }
            
            Inner inner = new Inner();
            inner.display();
        
        }
        
    }

}


public class InnerClassDemo3 {
    
    public static void main(String[] args){
    
        Outer3 outer = new Outer3();
        outer.test();
    }
    
}
