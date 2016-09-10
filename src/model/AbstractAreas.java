package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Utilizando métodos e classes abstratas
 * Capítulo 8 - Página 183
 */

abstract class Figure2{
    double dim1;
    double dim2;
    
    Figure2(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    
    // area agora é um método abstrato
    abstract double area();
}

class Rectangle2 extends Figure2{
    
    Rectangle2(double a, double b){
        super(a, b);
    }
    
    // sobrescrever área para retângulo
    double area(){
        System.out.println("Área Interna do Retângulo.");
        return dim1 * dim2;
    }
}

class Triangle2 extends Figure2{
    
    Triangle2(double a, double b){
        super(a,b);
    }

    // sobrescrever área para triangulo reto
    double area(){
        System.out.println("Área Interna do Triângulo");
        return dim1 * dim2 / 2;
    }
}

public class AbstractAreas {
    
    public static void main(String[] args){
        
        //Figure2 f = new Figure2(10,10); //Agora é ilegal
        Rectangle2 r = new Rectangle2(9,5);
        Triangle2 t = new Triangle2(10,8);
        
        Figure2 figref; //Ok, nenhum objeto é criado
        
        figref = r;
        System.out.println("A área é " + figref.area());
        
        figref = t;
        System.out.println("A área é " + figref.area());

    }
}
