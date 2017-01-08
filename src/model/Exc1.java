package model;

/**
 * @author raphaelmachadofreire
 * Manipulação de execeções
 * Exceções não capturadas
 * Capítulo 10 - Página 210
 */

public class Exc1 {
    static void subroutine(){
        int d = 0;
        int a = 10/d;
    }
    
    public static void main(String args[]){
        Exc1.subroutine();
    }
    
}
