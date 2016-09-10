package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Usando polimorfismo na execução
 * Capítulo 8 - Página 181
 */

// Usando o polimorfismo na execução.

class Figure{
    double dim1;
    double dim2;
    
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    
    double area(){
        System.out.println("A área da figura é indefinida");
        return 0;
    }
}

class Rectangle extends Figure{
    
    Rectangle(double a,double b){
        super(a,b);
    }
    
    //sobrescrever área para retângulo
    double area(){
        System.out.println("Area Interna do Retângulo");
        return dim1 * dim2;
    }

}

class Triangle extends Figure{
    
    Triangle(double a, double b){
        super(a,b);
    }

    // sobrescrever área para triangulo reto
    double area(){
        System.out.println("Área Interna do Triângulo");
        return dim1 * dim2 / 2;
    }
}

public class FindAreas {
    public static void main(String[] args){
    
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;
        
        figref = r;
        System.out.println("A área é " + figref.area());
        
        figref = t;
        System.out.println("A área é " + figref.area());
        
        figref = f;
        System.out.println("A área é " + figref.area());
        
    }
    
}
