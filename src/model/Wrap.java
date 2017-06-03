package model;

 /**
 * @author raphaelmachadofreire 
 * Enumerações, Autoboxing e Anotações Uma versão
 * Demonstrar um wrapper de tipo.
 * Capítulo 12 - Página 268
 */

class Wrap {
    
    public static void main(String args[]){
        
        Integer iOb = new Integer(100);
        
        int i = iOb.intValue();
        
        System.out.println(i + " " + iOb); // exibe 100 100
    
    }
    
}

