package model;

/**
 * @author raphaelmachadofreire 
 * Enumerações, Autoboxing e Anotações
 * Demonstrar ordinal(), compareTo() e equals()
 * Capítulo 12 - Página 266
 */

//Uma enumeração de tipos de maçãs
enum Apple{

    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}


class EnumDemo4 {
    public static void main(String args[]){
        
        Apple ap, ap2, ap3;
        
        //obter todos os valores ordinais, usando ordinal()
        System.out.println("Estas são todas as cosntantes de apple e seus valores ordinais");
        for(Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal());
        
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        
        System.out.println();
        
        //Demonstrar compareTo()
        if(ap.compareTo(ap2) < 0)
            System.out.println(ap2 + " vem antes de " + ap2);
   
        if(ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " vem antes de " + ap);
        
        if(ap.compareTo(ap3) == 0)
            System.out.println(ap + " é igual a " + ap3);
        
        System.out.println();
        
        //Demonstrar equals()
        
        if(ap.equals(ap2))
            System.out.println("Erro!");
        
        if(ap.equals(ap3))
            System.out.println(ap + " é igual a " + ap3);
        
        if(ap == ap3)
            System.out.println(ap + " == " + ap3);
  
    }
}
