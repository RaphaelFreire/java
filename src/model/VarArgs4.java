package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Varargs, sobrecarga e ambiguidade.
 * Este programa contém um erro e não compila!
 * Capítulo 7 - Página 159
 */

public class VarArgs4 {
    
    static void vaTest(int ... v){
        System.out.print("vaTest(int...); " + "Número de args: "+ v.length + " Conteúdo: ");
        
        for(int x:v)
            System.out.print(x + " ");
        System.out.println();
    
    }
    
    static void vaTest(boolean ... v){
        System.out.print("vaTest(boolean...); " + "Número de args: " + v.length + " Conteúdo: ");
        
        for(boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    
    
    public static void main(String[] args){
        
        vaTest(1,2,3);
        vaTest(true,false,false);
       // vaTest(); //Erro: Ambíguo!
    
    }
    
}
