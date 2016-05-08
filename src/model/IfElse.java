package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle 
 * Demonstrar as instruções if-ele-if
 * Capítulo 5 - Página 83
 */

public class IfElse {
    
    public static void main(String[] args) {
        
        int month = 4; // Abril
        String season;
        
        
        if(month == 12 || month == 1 || month == 2)
            season = "Inverno";
        else if(month == 3 || month == 4 || month == 5)
            season = "Primavera";
        else if(month == 6 || month == 7 || month == 8)
            season = "Verão";
        else if(month == 9 || month == 10 || month == 11)
            season = "Outono";
        else
            season = "Mês Falso";
        
        System.out.println("Abril está na/no " + season + ".");
        
    }
    
}
