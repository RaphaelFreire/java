package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Uma versão melhorada do programa das estações
 * Capítulo 5 - Página 86
 */

public class Switch {
    
    public static void main(String args[]){
        
        int month = 4;
        String season;
        
        switch(month){
            
            case 12:
            case 1:
            case 2:
                season = "Inverno";
                break;
            case 3:    
            case 4:    
            case 5:
                season = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                season = "Verão";
                break;
            case 9:
            case 10:
            case 11:
                season = "Outono";
                break;
            default:
                season = "Mês Falso";
        }
        
        System.out.println("Abril está na/no " + season + ".");
    }
}
