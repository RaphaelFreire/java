package p2;

/**
 * @author raphaelmachadofreire
 * Pacotes e Interfaces
 * Exemplo de acesso entre pacotes
 * Capítulo 9 - Página 192
 */

public class Protection2 extends p1.Protection {
    
    Protection2(){
    
            System.out.println("derivou o construtor em outro pacote");
          //System.out.println("n = " + n); // somente classe ou pacote
          //System.out.println("n_pri " + n_pri); //somente classe
            System.out.println("n_pro = " + n_pro);
            System.out.println("n_pub = " + n_pub);
    }
    
}
