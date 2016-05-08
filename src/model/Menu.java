package model;

/**
 * @author raphaelmachadofreire
 * Instruções de Controle
 * Utilizando um do-while para processar uma seleção de menu - um sistema de ajuda simples
 * Capítulo 5 - Página 91
 */

public class Menu {
    
    public static void main(String args[]) throws java.io.IOException{
    
        char choice;
        
        do{
            System.out.println("Ajuda sobre:");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do-while");
            System.out.println("    5. for \n");
            System.out.println("Escolha um: ");
            
            choice = (char) System.in.read();
            
        }while(choice < '1' || choice > '5');
        
        switch(choice){
        
            case '1':
                System.out.println("O if:");
                System.out.println("if(condição) instrução;");
                System.out.println("instrução else");
                break;
                
            case '2':
                System.out.println("A switch:");
                System.out.println("switch(expressão) {");
                System.out.println("constante case: ");
                System.out.println("sequência de instruções");
                System.out.println("    break;");
                System.out.println("    // ...");
                System.out.println("}");
                break;
                
            case '3':
                System.out.println("O while:");
                System.out.println("while(condição) instrução;");
                break;
                
            case '4':
                System.out.println("O do-while:");
                System.out.println("do {");
                System.out.println("instrução;");
                System.out.println("} while (condição);");
                break;
                
            case '5':
                System.out.println("O for:");
                System.out.println("for(init; condição; iteração");
                System.out.println("instrução;");
                break;
        
        }
    }
}
