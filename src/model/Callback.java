package model;

/**
 * @author raphaelmachadofreire
 * Pacotes e Interfaces
 * Definindo uma interface
 * Capítulo 9 - Página 197
 */

    interface Callback {
        void callback(int param);
    }

    class Client implements Callback{

        //Implementar a interface de Callback
        public void callback(int p){
            System.out.println("callback chamado com " + p);
        }

        void noIfaceMeth(){
            System.out.println("Classes que implementam interfaces também podem definir outros membros");
        }
    }

    class TestInterface{
        public static void main(String[] args){
            Callback c = new Client();
            c.callback(42);
        }
    }
    

    class AnotherClient implements Callback{
        //Implementar a interface de Callback
        public void callback(int p){
            System.out.println("Outra versão de callback");
            System.out.println("p ao quadrado é " + (p*p));
        }
    }

    class TestInterface2{
        public static void main(String[] args){
            Callback c = new Client();
            AnotherClient ob = new AnotherClient();
            
            c.callback(42);
            
            c = ob; //c agora se refere ao objeto AnotherClient
            
            c.callback(42);
        }
    
    }

    abstract class Incomplete implements Callback{
        int a, b;
        
        void show(){
            System.out.println(a + " " + b);
        }
    }
