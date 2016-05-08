package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Utilizar uma string para controlar uma instrução switch.
 * Capítulo 5 - Página 87
 */

public class StringSwitch {
    
    public static void main(String args[]){

        String str = "dois";
        
        switch(str){
    
            case "um":
                System.out.println("um");
                break;
            case "dois":
                System.out.println("dois");
                break;
            case "tres":
                System.out.println("três");
                break;
            default:
                System.out.println("incompatível");
                break;
        
        }
    }
}
