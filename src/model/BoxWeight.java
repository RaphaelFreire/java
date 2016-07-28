package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Este programa usa herança para estender Box
 * Capítulo 8 - Página 164
 */

class Box2{

    double width;
    double height;
    double depth;

    //construtor usado para transmitir objeto
    Box2(Box2 ob){ 
    
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    
    }
    
    //construtor usado quando todas as dimensões são especificadas
    Box2(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
    //construtor usado quando nenhuma dimensão é especificada
    Box2(){
        width = -1;     //usar -1 para indicar uma caixa não inicializada
        height = -1;
        depth = -1;
    }
    
    //construtor usado quando o cubo é criado
    Box2(double len){
        width = height = depth = len;
    }
    
    //calcular o retornar o volume
    double volume(){
        return width * height * depth;
    }
    
    
}

// Aqui, box é estendida para incluir weight.
class BoxWeight extends Box2 {
    
    double weight;
    
    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
        
    }
    
}

class DemoBoxWeight{
    public static void main(String[] args){
        
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        
        
        vol = mybox1.volume();
        System.out.println("O volume de mybox1 é " + vol);
        System.out.println("O peso de mybox1 é " + mybox1.weight);
        System.out.println();
        
        vol = mybox2.volume();
        System.out.println("O volume de mybox2 é " + vol);
        System.out.println("O peso de mybox2 é " + mybox2.weight);
        
        
    }
}