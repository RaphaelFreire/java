package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * O target de um loop pode ser vazio
 * Capítulo 5 - Página 89
 */

public class NoBody {
    
    public static void main(String args[]){
    
        int i, j;
        i = 100;
        j = 200;
        
        // econtrar valor médio entre i e j
        while(++i < --j); // não há corpo neste loop
        
        System.out.println("O valor médio é " + i);

    }
    
}
