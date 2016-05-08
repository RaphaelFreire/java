package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Em um siwtch, as instruções break são opcionais
 * Capítulo 5 - Página 85
 */

public class MissingBreak {
    
    public static void main(String args[]){
    
        for(int i = 0; i < 12; i++){
            
            switch(i){
                
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i é menor que 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:    
                case 9:
                    System.out.println("i é menor que 10");
                    break;
                default:
                    System.out.println("i é igual ou maior que 10");
            
            }
        }
    }
}
