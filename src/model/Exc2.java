package model;

/**
 * @author raphaelmachadofreire
 * Manipulação de execeções
 * Exceções não capturadas
 * Capítulo 10 - Página 210
 */

public class Exc2 {
    public static void main(String args[]){
        
        int d, a;
        
        try{
            //monitorar um bloco de código
            d = 0;
            a = 42/d;
            System.out.println("Isto não será impresso.");
        }
        catch(ArithmeticException e){
            // capturar o erro de divisão por zero
            System.out.println("Divisão por zero.");
            System.out.println("Após a instrução catch");
        }
    }
}
