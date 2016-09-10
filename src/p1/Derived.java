package p1;

/**
 * @author raphaelmachadofreire
 * Pacotes e Interfaces
 * Exemplo de acesso entre pacotes
 * Capítulo 9 - Página 192
 */

public class Derived extends Protection {
    
    Derived(){
        System.out.println("construtor derivado");
        
        
        System.out.println("n = " + n);
      //System.out.println("n_pri = " + n_pri); //somente classe
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    
    }
    
}
