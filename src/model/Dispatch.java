package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Métodos com assinaturas de tipo diferentes são sobrecarregados - não sobrescritos.
 * Capítulo 8 - Página 178
 */

//Despacho Dinâmico de Método
class A8{
    void callme(){
        System.out.println("Dentro do método callme de A");
    }
}

class B8 extends A8{

    // Sobrescrer callme
    void callme(){
        System.out.println("Dentro do método callme de B");
    }
}


class C8 extends B8{
    // Sobrescrer callme
    void callme(){
        System.out.println("Dentro do método callme de C");
    }
}


public class Dispatch {
    
    public static void main(String[] args){
    
        A8 a = new A8(); // objeto do tipo A
        B8 b = new B8(); // objeto do tipo B
        C8 c = new C8(); // objeto do tipo C
        
        A8 r; // obter uma referencia do tipo A
        
        r = a; // refere-se a um objeto de A
        r.callme(); // chama uma versão de callme de A
        
        r = b;
        r.callme();
        
        r = c;
        r.callme();
        
    }
    
}
