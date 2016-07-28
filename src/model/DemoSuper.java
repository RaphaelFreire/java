package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Uma implementação completa de BoxWeight 
 * Capítulo 8 - Página 168
 */

class Box3{
    
    private double width;
    private double height;
    private double depth;

    
    //construir o clone de um objeto
    Box3(Box3 ob){ //transmitir o objeto para o construtor
        
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    
    // construtor usado quando todas as dimensões são especificadas
    Box3(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
    //construtor usado quando nenhuma dimensão é especificada
    Box3(){
        width = -1;
        height = -1;
        depth = -1;
    }
    
    //construtor usado quando o cubo é criado
    Box3(double len){
        width = height = depth = len;
    }
    
    //calcular e retornar volume
    double volume(){
        return width * height * depth;
    }
    
}

//BoxWeight agora implementa totalmente todos os construtores
class BoxWeight3 extends Box3{
    double weight; // Peso da caixa

    
    //construir o clone de um objeto
    BoxWeight3(BoxWeight3 ob){
        super(ob);
        weight = ob.weight;
    }

    //construtor quando todos os parâmetros são especificados
    BoxWeight3(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }
    
    //construtor padrão
    BoxWeight3(){
        super();
        weight = -1;
    }
    
    //construtor usado quando o cubo é criado
    BoxWeight3(double len, double m){
        super(len);
        weight = m;
    }

}



public class DemoSuper {
    public static void main(String[] args){
        BoxWeight3 mybox1 = new BoxWeight3(10,20,15,34.3);
        BoxWeight3 mybox2 = new BoxWeight3(2, 3, 4, 0.076);
        BoxWeight3 mybox3 = new BoxWeight3(); //padrão
        BoxWeight3 mycube = new BoxWeight3(3, 2);
        BoxWeight3 myclone = new BoxWeight3(mybox1);
        double vol;
        
        vol = mybox1.volume();
        System.out.println("O volume de mybox1 é " + vol);
        System.out.println("O peso de mybox1 é " + mybox1.weight);
        System.out.println();
        
        vol = mybox2.volume();
        System.out.println("O volume de mybox2 é " + vol);
        System.out.println("O peso de mybox2 é " + mybox2.weight);
        System.out.println();
        
        vol = mybox3.volume();
        System.out.println("O volume de mybox3 é " + vol);
        System.out.println("O peso de mybox3 é " + mybox3.weight);
        System.out.println();
        
        vol = myclone.volume();
        System.out.println("O volume de myclone é " + vol);
        System.out.println("O pesso de myclone é " + myclone.weight);
        System.out.println();
        
        vol = mycube.volume();
        System.out.println("O volume de mycube é " + vol);
        System.out.println("O peso de mycube é " + mycube.weight);
        System.out.println();
    
    }
}
