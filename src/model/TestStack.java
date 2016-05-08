package model;

/**
 * @author raphaelmachadofreire
 * Instruções às classes
 * Demonstra a classe Stack, cria pilhas de inteiros, insere valores em cada uma e sem seguida remove
 * Capítulo 6 - Página 128
 */

public class TestStack {
    
    public static void main(String args[]){
    
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        
        // inserir alguns membros na pilha
        for(int i=0; i<10; i++) mystack1.push(i);
        for(int i=10; i<20; i++) mystack2.push(i);
        
        // remover os membros inseridos na pilha
        System.out.println("Pilha em mystack1: ");
        for(int i=0; i < 10; i++)
            System.out.println(mystack1.pop());
        
        System.out.println("Pilha em mystack2: ");
        for(int i=0; i < 10; i++)
            System.out.println(mystack2.pop());
    
    }
    
}
