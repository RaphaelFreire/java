package model;

/**
 * @author raphaelmachadofreire
 * Instruções às classes
 * Criação da Classe box
 * Capítulo 6 - Página 110
 * Alterado: Capítulo 7 - Página 133 
 * Alterado: Capítulo 7 - Página 135
 */

public class Box {
    
    double width;
    double height;
    double depth;
    
    // Este é o construtor para Box usado quando todas as dimensões são especificadas
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
    //Observe este construtor. Ele leva um objeto do tipo Box.
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    
    // Construtor usado quando as dimensões não são especificadas
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    
    // Construtor usado quando é criado um cubo
    Box(double len){
       width = height = depth = len;
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
