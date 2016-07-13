package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Este programa demonstra alguns métodos de String
 * Capítulo 7 - Página 153
 */

public class StringDemo2 {
    
    public static void main(String[] args){
        
        String strObj1 = "Primeiro String";
        String strObj2 = "Segundo String";
        String strObj3 = strObj1;
        
        System.out.println("Comprimento de strObj1: " + strObj1.length());
        
        System.out.println("Caracter no indice 3 de strOb1: " + strObj1.charAt(3));
        
        if(strObj1.equals(strObj2))
            System.out.println("strObj1 == strObj2");
        else
            System.out.println("strObj1 != strObj2");
        
        
        if(strObj1.equals(strObj3))
            System.out.println("strObj1 == strObj3");
        else
            System.out.println("strObj1 != strObj3");
    
    }
    
}
