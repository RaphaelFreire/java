package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Criando uma hierarquia de vários níveis
 * Capítulo 8 - Página 171
 */


// Começar com Box

class Box4{
    
    private double width;
    private double height;
    private double depth;
    
    
    // construir o clone de um objeto
    Box4(Box4 ob){ //transmitir o objeto para o construtor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    // construtor usado quando todas as dimensões são especificadas
    Box4(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
    // construtor usado quando nenhuma dimensão é especificada
    Box4(){
        width = -1;
        height = -1;
        depth = -1;
    }
    
    // construtor usado quando o cubo é criado
    Box4(double len){
        width = height = depth = len;
    }
    
    // calcular e retornar o volume
    double volume(){
        return width * height * depth;
    }
}


// Acrescentando o peso
class BoxWeight4 extends Box4{
    
    double weight; // peso da caixa
    
    // construir o clone de um objeto
    BoxWeight4(BoxWeight4 ob){// transmitindo o objeto para o construtor
        super(ob);
        weight = ob.weight;
    }
    
    // construtor quando todos os parâmetros são especificados
    BoxWeight4(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }
    
    // construtor usado quando nenhuma dimensão é especificada
    BoxWeight4(){
        super();
        weight = -1;
    }
    
    // construtor usado quando o cubo é criado
    BoxWeight4(double len, double m){
        super(len);
        weight = m;
    }
}

// Acrescentar custos de envio.
class Shipment extends BoxWeight4{
    double cost;
    
    // construir o clone de um objeto
    Shipment(Shipment ob){ //transmitindo o objeto para o construtor
        super(ob);
        cost = ob.cost;
    }
    
    // construtor quando todos os paramentros são especificados
    Shipment(double w, double h, double d, double m, double c){
        super(w,h,d,m); //chama o construtor da superclasse
        cost = c; 
    }
    
    // construtor usado quando nenhuma dimensão é especificada
    Shipment(){
        super();
        cost = -1;
    }
    
    // construtor usado quando o cubo é criado
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }

}

public class DemoShipment {
    public static void main(String[] args){
        
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        
        double vol;
        
        vol = shipment1.volume();
        System.out.println("O volume de shipment1 é: " + vol);
        System.out.println("O peso de shipment1 é: " + shipment1.weight);
        System.out.println("O custo de envio: R$ " + shipment1.cost);
        System.out.println();
        
        vol = shipment2.volume();
        System.out.println("O volume de shipment2 é: " + vol);
        System.out.println("O peso de shipment2 é: " + shipment2.weight);
        System.out.println("O custo de envio: R$ " + shipment2.cost);
        
        
    }
}
