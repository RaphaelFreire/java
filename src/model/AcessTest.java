package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Este programa demonstra a diferença entre public e private
 * Capítulo 7 - Página 143
 */

class Test5{
    int a; //acesso padrão
    public int b; //acesso publico
    private int c; //acesso privado
    
    
    //método para acessar c
    void setc(int i){
        c = i;
    }
    
    int getc(){
        return c;
    }
    
}

public class AcessTest {
    
    public static void main(String args[]){
        
        Test5 ob = new Test5();
        
        // Ok, a e b podem ser acessados diretamente
        ob.a = 10;
        ob.b = 20;
        
        // Não OK e causará um erro 
        // ob.c = 100;  Erro!!!
        
        // Você deve acessar c por meio de seus métodos
        ob.setc(100);
        
        System.out.println("a,b e c: " + ob.a +" " + ob.b + " " + ob.getc());
        
        
    }
    
}
