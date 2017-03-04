package model;

/**
 * @author raphaelmachadofreire
 * Manipulação de execeções
 * Manipular exceções e continuar
 * Capítulo 10 - Página 211
 */

import java.util.Random;

public class HandleError {
       public static void main(String args[]){
           int a = 0, b = 0, c = 0;
           
           Random r = new Random();
           
           for(int i=0; i<3200; i++){
               try{
                   b = r.nextInt();
                   c = r.nextInt();
                   a = 12345/(b/c);
               }
               catch(ArithmeticException e){
                   System.out.println("Divisão por zero");
                   a = 0; //configurar a para zero e confirmar
               }
               System.out.println("a: " + a);
           }
           
       }
}
