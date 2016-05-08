package model;

/**
 * @author raphaelmachadofreire
 * Instruções às classes
 * Esta classe define uma pilha de inteiros que pode conter 10 valores
 * Capítulo 6 - Página 127
 */

public class Stack {
    
    int stck[] = new int[10];
    int tos;
    
    //Inicializar topo da pilha
    Stack(){
        tos = -1;
    }
    
    //Inserir um item na pilha
    void push(int item){
        if(tos == 9)
            System.out.println("A pilha está cheia.");
        else
            stck[++tos] = item;
    }
    
    //Tirar um item da pilha
    int pop(){
        if(tos < 0){
            System.out.println("A pilha está vazia");
            return 0;
        }else
            return stck[tos--];
    }
}
