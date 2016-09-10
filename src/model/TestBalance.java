package model;
import MyPack.*;


/**
 * @author raphaelmachadofreire
 * Pacotes e Interfaces
 * Demonstrando import
 * Capítulo 9 - Página 195
 */


public class TestBalance {
    
    public static void main(String[] args){
        // Como Balance é public, você pode usar a classe Balance e chamar seu construtor.
        Balance test = new Balance("J.J. Jaspers", 99.88);
        Balance test2 = new Balance("Raphael", -1);
        
        test.show(); //você também pode chamar show();
        test2.show(); 
    }
    
}
