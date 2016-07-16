package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Demonstrar os argumentos de comprimento variável
 * Capítulo 7 - Página 156
 */

public class VarArgs {
    
    // vaTest() agora usa um vararg
    static void vaTest(int ... v){
        System.out.print("Número de argumentos: " + v.length + " Conteúdo: ");
        
        for(int x : v)
            System.out.print(x + " ");
            System.out.println();
    
    }
    
    public static void main(String[] args){
        // Repare como vaTest() pode ser chamado com um número variável de argumentos
        
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    
    }
    
}
