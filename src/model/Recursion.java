package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Demonstra um exemplo simples de recursão
 * Capítulo 7 - Página 139
 */


class Factorial{
    // Esta pe uma função recursiva
    int fact(int n){
        int result;
        
        if(n==1) return 1;
        result = fact(n-1)*n;
        return result;
    }
} 

public class Recursion {
    public static void main(String args[]){
        Factorial f = new Factorial();
        
        System.out.println("O fatorial de 3 é: " + f.fact(3));
        System.out.println("O fatorial de 4 é: " + f.fact(4));
        System.out.println("O fatorial de 5 é: " + f.fact(5));
        
    }
}
