package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Utilizando break como uma forma civilizada de goto.
 * Capítulo 5 - Página 104
 */

public class Break {
    
    public static void main(String args[]){
    
        boolean t = true;
        
        first:{
            second:{
                third:{
                    System.out.println("Antes de break;");
                    if(t) break second; // quebra do segundo bloco
                    System.out.println("Isto não será executado");
                }
                System.out.println("Isto não será executado");
            }
            System.out.println("Isto vem após o segundo bloco");
            
        }
        
    }
    
}
