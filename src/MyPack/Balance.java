package MyPack;

/**
 * @author raphaelmachadofreire
 * Pacotes e Interfaces
 * Demonstrando import
 * Capítulo 9 - Página 195
 */

/*
    Agora, a classe Balance, seu construtor e seu método show() são public. Isso significa que eles
    podem ser usados por códigos de não-subclasses ao pacote.
*/


public class Balance {
    
    String name;
    double bal;
    
    public Balance(String n, double b){
        name = n;
        bal = b;
    }
    
    public void show(){
        if(bal < 0)
            System.out.print("--> ");
        System.out.println(name + ": $" + bal);
    }
    
}
