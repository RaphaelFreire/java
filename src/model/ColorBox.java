package model;

/**
 * @author raphaelmachadofreire
 * Herança
 * Este programa usa herança para estender Box e inclui a cor
 * Capítulo 8 - Página 165
 */

public class ColorBox extends Box2 {
    
    int color; // cor da caixa
    
    ColorBox(double w, double h, double d, int c){
     
        width = w;
        height = h;
        depth = d;
        color = c;
    
    }
    
}
