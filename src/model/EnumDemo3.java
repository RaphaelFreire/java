//package model;
//
///**
// * @author raphaelmachadofreire 
// * Enumerações, Autoboxing e Anotações
// * Utilizar um construtor, um metodo de instancia e um metodo de enum
// * Capítulo 12 - Página 263
// */
//
//enum Apple{
//   Jonathan(10), GoldenDel(9), RedeDel(12), Winesap(15), Cortland(8);
//   
//   private int price; // preço de cada maçã
//   
//   //Construtor
//   Apple(int p){
//       price = p;
//   }
//   
//   int getPrice(){
//       return price;
//   }
//}
//
//public class EnumDemo3 {
//    public static void main(String[] args) {
//        Apple ap;
//        
//        //Mostrar preço de winesap
//        System.out.println("Winesap custa: " + Apple.Winesap.getPrice() + " centavos \n");
//        
//        //Exibe todas as maçã e preços
//        System.out.println("Exibe todas as maçãs: ");
//        for(Apple a : Apple.values())
//            System.out.println(a + "custa " + a.getPrice() + " centavos.");
//    }
//}
