package model;

/**
 * @author raphaelmachadofreire
 * Pacotes e Interfaces
 * Um exemplo de interface aninhada
 * Capítulo 9 - Página 200
 */

//Esta classe contém um membro de interface
class A11{
    
    //esta é uma interface aninhada
    public interface NestedIF{
        boolean isNotNegative(int x);
    }
}

// B implementa a interface aninhada.
class B11 implements A11.NestedIF{
    
    public boolean isNotNegative(int x){
        return x < 0 ? false : true;
    }
}

public class NestedIfDemo {
    public static void main(String[] args){
        //usar uma referencia da interface aninhada
        A11.NestedIF nif = new B11();
        
        if(nif.isNotNegative(10))
            System.out.println("10 não é negativo");
        if(nif.isNotNegative(-12))
            System.out.println("isto não será exibido");
    }
}
