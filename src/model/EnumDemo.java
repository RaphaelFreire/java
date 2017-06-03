//package model;
//
///**
// * @author raphaelmachadofreire 
// * Enumerações, Autoboxing e Anotações
// * Capítulo 12 - Página 261
// */
//
//Uma enumeração do tipo de maçã
//enum Apple{
//    Jonathan, GoldenDel, RedDel, Winesap, Cortland 
//}
//
//public class EnumDemo {
//    public static void main(String[] args) {
//        Apple ap;
//        
//        ap = Apple.RedDel;
//        
//        Gerar um valor enum
//        System.out.println("Valor de ap: " + ap);
//        System.out.println();
//        
//        ap = Apple.GoldenDel;
//        Comparar dois valores enum
//        if(ap == Apple.GoldenDel)
//            System.out.println("ap contém GoldenDel\n");
//        
//        Usar uma enum para controlar uma instrução switch.
//        switch(ap){
//        
//            case Jonathan:
//                System.out.println("Jonathan é vermelha");
//                break;
//            case GoldenDel:
//                System.out.println("GoldenDel é amarela");
//                break;
//            case RedDel:
//                System.out.println("RedDel é vermelha");
//                break;
//            case Winesap:
//                System.out.println("Winesap é vermelha");
//                break;
//            case Cortland:
//                System.out.println("Cortland é vermelha");
//                break;
//        
//        }
//    }
//}
