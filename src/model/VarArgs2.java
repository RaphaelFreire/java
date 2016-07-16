package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Utilizando varargs com argumentos padrão.
 * Capítulo 7 - Página 157
 */

public class VarArgs2 {
    
    //Aqui, msg é um parâmetro normal e v é um parâmetro varargs.
    static void vaTest(String msg, int...v){
        System.out.print(msg + v.length + " Conteúdo; ");
        
        for(int x:v)
            System.out.print(x + " ");
        System.out.println();
    }
    
    public static void main(String[] args){
        vaTest("Um varargs: ", 10);
        vaTest("Três varargs: ", 1, 2, 3);
        vaTest("Nenhum varargs: ");
    
    }
}
