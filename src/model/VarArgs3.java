package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Utilizando varargs com argumentos padrão.
 * Capítulo 7 - Página 158
 */

public class VarArgs3 {
       
    static void vaTest(int ... v){
    
        System.out.print("vaTest(int ...): " + "Número de args: " + v.length + " Conteúdo: ");
        
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    
    }
    
    
    static void vaTest(boolean ... v){
        System.out.print("vaTest(boolean ...): " + "Números de args: " + v.length + " Conteúdos: ");
       
        for(boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    
    
    static void vaTest(String msg, int ... v){
        System.out.print("vaTest(String msg, int ...): " + msg + "Números de args: " + v.length + " Conteúdos: ");
    
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    
    }
    
    public static void main(String[] args){
        vaTest(1, 2, 3);
        vaTest("Testando: ", 10, 20);
        vaTest(true, true, false);
    
    }
}
