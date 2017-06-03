package model;

 /**
 * @author raphaelmachadofreire 
 * Enumerações, Autoboxing e Anotações Uma versão
 * Autoboxing / unboxing ocorre dentro de expressões
 * Capítulo 12 - Página 272
 */

class AutoBox3 {
    public static void main(String[] args) {
        
        Integer iOb, iOb2;
        int i;
        
        iOb = 100;
        System.out.println("Valor original de iOb: " + iOb);
        
        //A linha a seguir desencaixota iOb automaticamento faz o incremento e encaixota novamente o resultado em iOb;
        ++iOb;
        System.out.println("Após ++iOb: " + iOb);
        
        //Aqui, iOb é desencaixotado, a expressão é avaliada, e o resultado é encaixotado novamente e atribuido a iOb2.
        iOb2 = iOb + (iOb/3);
        System.out.println("iOb2 após a expressão: " + iOb2);
        
        //A mesma expressão é avaliada, mas o resultado não é encaixotado novamente.
        i = iOb + (iOb/3);
        System.out.println("i após a expressão: " + i);
        
        
        
    }
    
}
