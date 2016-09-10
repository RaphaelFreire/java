package model;

/**
 * @author raphaelmachadofreire
 * Pacotes e Interfaces
 * Aplicando Interfaces em uma pilha de inteiros
 * Capítulo 9 - Página 201
 */

// Definir uma interface de pilha de inteiros
interface IntStack {
    void push(int item); //armazenar um item
    int pop(); //remover um item
}

class FixedStack implements IntStack{
    
    private int stck[];
    private int tos;
    
    //alocar e inicializar a pilha
    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }
    
    //Inserir um item na pilha
    public void push(int item){
        if(tos == stck.length-1) // usar o membro lenght
            System.out.println("A pilha está cheia.");
        else
            stck[++tos] = item;
        
    }
    
    //Retirar um item da pilha
    public int pop(){
        if(tos< 0){
            System.out.println("A pilha está vazia");
            return 0;
        }
        else
            return stck[tos--];
    }

}

class IFTest{
    public static void main(String[] args){
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
        
        //inserir alguns membros na pilha
        for(int i=0; i<5; i++) mystack1.push(i);
        for(int i=0; i<8; i++) mystack2.push(i);
        
        //remover estes membros da pilha
        System.out.println("Pilha em mystack1: ");
        for(int i=0; i<5; i++)
            System.out.println(mystack1.pop());
        
        System.out.println("Pilha em mystack2: ");
        for(int i=0; i<8; i++)
            System.out.println(mystack2.pop());
    }
}



/**
 * @author raphaelmachadofreire
 * Pacotes e Interfaces
 * Implementar uma pilha "expansível"
 * Capítulo 9 - Página 202
 */

class DynStack implements IntStack{
    private int stck[];
    private int tos;

    //alocar e inicializar a pilha
    DynStack(int size){
        stck = new int[size];
        tos = -1;
    }
    
    //inserir um item na pilha
    public void push(int item){
        // se a pilha estiver cheia, alocar uma pilha maior
        if(tos==stck.length-1){
            int temp[] = new int[stck.length*2]; //double size
            for(int i=0; i<stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }else{
            stck[++tos] = item;
        }
    }
    
    //Remover um item da pilha
    public int pop(){
        if(tos<0){
            System.out.println("A pilha esta vazia");
            return 0;
        }else{
            return stck[tos--];
        }
    }
}

class IFTest2{
    public static void main(String[] args){
    
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
        
        //estes loops fazem com que cada pilha cresça
        for(int i=0; i<12; i++) mystack1.push(i);
        for(int i=0; i<20; i++) mystack2.push(i);
        
        System.out.println("Pilha em mystack1: ");
            for(int i=0; i<12; i++){
                System.out.println(mystack1.pop());
            }
        
        System.out.println("Pilha em mystack2: ");
            for(int i=0; i<20; i++){
                System.out.println(mystack2.pop());
            }
        
    }


}


/**
 * @author raphaelmachadofreire
 * Pacotes e Interfaces
 * Criar uma variável de interface e acessar as pilhas por meio dela
 * Capítulo 9 - Página 203
 */

class IFTest3{
    public static void main(String[] args){
        IntStack mystack; //criar uma variável de referencia de interface
        
        
        DynStack ds = new DynStack(5);
        
        mystack = ds; // carregar a pilha dinamica
        //inserir alguns membros na pilha
        for(int i=0;i<12;i++)mystack.push(i);
        
        mystack = ds;
        System.out.println("Valores na pilha dinamica");
        for(int i = 0; i<12;i++)
            System.out.println(mystack.pop());
        
        
        FixedStack fs = new FixedStack(8);
        
        mystack = fs; //carregar pilha fixa
        for(int i=0; i<8; i++)mystack.push(i);
        
        mystack = fs;
        System.out.println("Valores na pilha fixa");
        for(int i = 0; i<8;i++)
            System.out.println(mystack.pop());
   
    
    }
}