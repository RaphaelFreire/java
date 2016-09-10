package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Métodos com assinaturas de tipo diferentes são sobrecarregados - não sobrescritos.
 * Capítulo 8 - Página 177
 */


class A7{
    
    int i, j;
        
    A7(int a, int b){
        i = a;
        j = b;
    }
    
    // exibir i e j
    void show(){
        System.out.println("i e j: " + i + " " + j);
    }
}

// Criar uma subclasse estendendo a classe A
class B7 extends A7{
    
    int k;
    
    B7(int a, int b, int c){
        super(a,b);
        k = c;
    }
    
    // sobrecarregar show()
    void show(String msg){
        System.out.println(msg + k);
    }
}



public class Override2 {
    
    public static void main(String[] args){
        B7 subOb = new B7(1, 2, 3);
        
        subOb.show("Este é k: ");
        subOb.show();
    }
    
}
