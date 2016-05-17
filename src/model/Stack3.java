package model;

/**
 * @author raphaelmachadofreire
 * Detalhe sobre métodos e classes
 * Classe Stack melhorada que usa o membro de array length.
 * Capítulo 7 - Página 148
 */

public class Stack3 {
    
    private int stck[];
    private int tos;
    
    // alocar e inicializar a pilha
    Stack3(int size){
        stck = new int[size];
        tos = -1;
    }
      
    //inserir um item na pilha
    void push(int item){
        if(tos == stck.length-1) //usar o membro legth
            System.out.println("A pilha está cheia");
        else
            stck[++tos] = item;
    }
    
    //remover um item da pilha
    int pop(){
        if(tos < 0){
            System.out.println("A pilha está vazia");
            return 0;
        }
        else
            return stck[tos--];
    }
    
}

class TestStack3{
    public static void main(String args[]){
        
        Stack3 myStack1 = new Stack3(5);
        Stack3 myStack2 = new Stack3(8);
        
        
        for(int i = 0 ; i < 5; i++) myStack1.push(i);
        for(int i = 0; i < 8; i++) myStack2.push(i);
        
        for(int i = 0; i < 5; i++)
            System.out.println("Pilha em myStack1: " + myStack1.pop());
        
        for(int i = 0; i < 8; i++)
            System.out.println("Pilha em myStach2: " + myStack2.pop());
       
    }
}
