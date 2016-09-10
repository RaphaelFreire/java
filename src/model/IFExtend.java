package model;

/**
 * @author raphaelmachadofreire
 * Pacotes e Interfaces
 * Uma interface pode estender outra
 * Capítulo 9 - Página 206
 */


interface A4{
    void meth1();
    void meth2();
}


//B agora inclui meth1() e meth2() e acrescenta meth3()
interface B4 extends A4{
    void meth3();
}


class MyClass implements B4{
    public void meth1(){
        System.out.println("Implementar meth1()");
    }
    
    public void meth2(){
        System.out.println("Implementar meth2()");
    }
    
    public void meth3(){
        System.out.println("Implementar meth3()");
    }
    
}


public class IFExtend {
    public static void main(String args[]){
        MyClass ob = new MyClass();
        
        ob.meth1();
        ob.meth2();
        ob.meth3();
    
    }
}



