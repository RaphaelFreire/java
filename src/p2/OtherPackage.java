package p2;

/**
 * @author raphaelmachadofreire
 * Pacotes e Interfaces
 * Exemplo de acesso entre pacotes
 * Capítulo 9 - Página 193
 */

public class OtherPackage {
    
    OtherPackage(){
        p1.Protection p = new p1.Protection();
        System.out.println("construtor de outro pacote");
        
        //somente classe ou pacote
        //System.out.println("n = " p.n);
        
        //somente classe
        //System.out.println("n_pri = " + p.n_pri);
        
        //somente classe, subclasse ou pacote
        //System.out.println("n_pro = " + p.n_pro)
        
        System.out.println("n_pub = " + p.n_pub);
    }
    
}
