package p1;

/**
 * @author raphaelmachadofreire
 * Pacotes e Interfaces
 * Exemplo de acesso entre pacotes
 * Capítulo 9 - Página 192
 */

public class SamePackage {
    
    SamePackage(){
        Protection p = new Protection();
        System.out.println("construtor de mesmo pacote");
        
        System.out.println("n = " + p.n);
      //System.out.println("n_pri = " + p.n_pri); // somente classe
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
        
    
    }
}
