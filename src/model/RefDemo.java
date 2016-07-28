package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Uma variável de Superclasse refereciando um objeto de Subclasse
 * Capítulo 8 - Página 166
 */

public class RefDemo {
    
    public static void main(String[] args){
        
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box2 plainbox = new Box2();
        double vol;
        
        vol = weightbox.volume();
        System.out.println("Volume de weightbox é " + vol);
        System.out.println("Peso de weightbox é " + weightbox.weight);
        System.out.println();
        
        // atribuir a referência de BoxWeight à referência de Box plainbox = weightbox;
        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("Volume de plainbox é " + vol);
        
        // A instrução a seguir é inválida porque plainbox não define um membro de weight.
//      System.out.println("Peso de plainbox é " + plainbox.weigth);
    
    }
    
}
