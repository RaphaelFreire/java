package model;

 /**
 * @author raphaelmachadofreire 
 * Enumerações, Autoboxing e Anotações Uma versão
 * Autoboxing / unboxing o ocorre com parâmetros de métodos e valores de retorno
 * Capítulo 12 - Página 271
 */

public class AutoBox2 {
    
    //Pegar um parâmetros de integer e retornar
    
    //um valor int
    static int m(Integer v){
        return v;   //autounbox para int 
    }
    
    public static void main(String[] args) {
        //transmitir um int para m() e atribuir o valor de retorno a um Integer. Aqui, o argumento 100 é autoboxed
        //para um Integer. O valor de retorno também é autoboxed para um Integer.
        
        Integer iOb = m(100);
        System.out.println(iOb);
        
    }
}
