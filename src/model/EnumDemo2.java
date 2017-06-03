package model;

/**
 * @author raphaelmachadofreire 
 * Enumerações, Autoboxing e Anotações
 * Utiliza os métodos values e valueOf de enumeração
 * Capítulo 12 - Página 262
 */


public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Aqui estão todos as constantes de Apple");
        
        //utiliza values()
        Apple allapples[] = Apple.values();
        for(Apple a : allapples)
            System.out.println(a);
        
        System.out.println();
        
        //utiliza valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contém " + ap);
    }
}
