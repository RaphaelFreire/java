package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Este programa não será compilado
 * Capítulo 7 - Página 150
 */


class Outer2{
    int outer_x = 100;
    
    void test2(){
        Inner2 inner2 = new Inner2();
        inner2.display();
    }
    
    
    class Inner2 {
        int y = 10;
        void display(){
            System.out.println("exibir: outer_x = " + outer_x);
        }
    }
     
    void showy(){
           // System.out.println(y); erro, y não é conhecido aqui!
        }
    
}




public class InnerClassDemo2 {
    
    public static void  main(){
    
        Outer2 outer = new Outer2();
        outer.test2();
    }
    
}
