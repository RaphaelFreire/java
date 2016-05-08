package model;

/**
 * @author raphaelmachadofreire
 * Regras de Promoção de Tipos
 * capítulo 3 - Páginas 50 e 51
*/

public class Promote {
    
    public static void main(String[] args) {
        
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        
        double result = (f*b) + (i/c) - (d*s);
        
        System.out.println((f*b) + " + " + (i/c) + " - " + (d*s));
        System.out.println("resultado = " + result);
        
    }
    
}

/*
 * Na primeira subexpressão f*b é promovido para float e o resultado é float
 * Na subexpressão i/c é promovido para int e o resutlado é int
 * Na subexpressão d*s é promovido para double e o resultado é double
 * Agora os três valores intermediários considerados são float, int, double.
 * O resultado de float + int é float. Em seguida, float - double o resultado promovido
 * é double, que é o tipo do resultado final da expressão
*/