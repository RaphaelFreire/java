package model;

/**
 * @author raphaelmachadofreire
 * Instruções às classes
 * Criação da Classe box
 * Capítulo 6 - Página 110
 */

public class Box {
    
    double width;
    double height;
    double depth;
    
    // Este é o construtor para Box
    Box(){
        System.out.println("Construindo um Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    
    // Este é o construtor para Box
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
    // calcular e retornar o volume
    double volume(){
        return width * height * depth;
    }
    
    // configurar dimensões da caixa
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
}
