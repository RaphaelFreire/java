package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Usar uma array para transmitir um número variável de argumentos para um
 * método. Esta é a abordagem à moda antiga para argumentos de comprimento variável.
 * Capítulo 7 - Página 155
 */

public class PassArray {
    
    static void vaTest(int v[]){
        System.out.println("Número de argumentos: " + v.length + " Conteúdo: ");
        
        for(int x : v)
            System.out.print(x + " ");
            System.out.println();
        
    }
    
    
    public static void main(String[] args){
        
        //Repare como o array deve ser criado para conter o argumentos.
        
        int n1[] = {10};
        int n2[] = {1,2,3};
        int n3[] = { };
        
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);

    
    }
    
}
