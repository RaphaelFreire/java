package model;

 /**
 * @author raphaelmachadofreire 
 * Enumerações, Autoboxing e Anotações Uma versão
 * Demonstrar um autoboxing/autounboxing
 * Capítulo 12 - Página 271
 */

public class AutoBox {
    public static void main(String args[]){
        
        Integer iOb = 100; //autobox um int
        
        int i = iOb; //auto-unbox
        
        System.out.println(i + " " + iOb); // exibe 100 100
    
    }
}
