package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Agora, stck e tos são private. Isso significa que eles não podem
 * ser alterados acidentalmente ou maliciosamente de maneira que possa
 * prejudicar a pilha.
 * Capítulo 7 - Página 143
 */

public class Stack2 {
    
    private int stck[] = new int[10];
    private int tos;
    
    //inicializar o topo da pilha
    Stack2(){
        tos = -1;
    }
    
    // inserir um item na pilha
    void push(int item){
        if(tos == 9)
            System.out.println("A pilha está cheia.");
        else
            stck[++tos] = item;
    }
    
    //remover um item da pilha
    int pop(){
        if(tos < 0){
            System.out.println("A pilha esta vazia.");
            return 0;
            
        }
        else{
            return stck[tos--];
        }
    }
    
}

class TestStack2{
    
    public static void main(String args[]){
        
        Stack2 myStack1 = new Stack2();
        Stack2 myStack2 = new Stack2();
        
        // inserir alguns membros na pilha
        for(int i = 0; i < 10; i++) myStack1.push(i);
        for(int i = 10; i < 20; i++) myStack2.push(i);
        
        // remover os membros da pilha
        System.out.println("Pilha em myStack1: ");
        for(int i=0; i<10; i++)
            System.out.println(myStack1.pop());
        
        System.out.println("Pilha em myStack2: ");
        for(int i=0; i<10; i++)
            System.out.println(myStack2.pop());
        
        
        // estas instruções não são legais  
        // myStack1.tos = -1;
        // myStack2.stck[2] = 100;
    }


}
