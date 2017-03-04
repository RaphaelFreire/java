package model;

/**
 * @author raphaelmachadofreire
 * A Classe Applet
 * Esqueleto de um Applet
 * Capítulo 22 - Página 683
 */

import java.awt.*;
import java.applet.*;

/*
<applet code="AppletSkel" width=300 height=100>
</applet>
*/

public class AppletSkel extends Applet {
    
    // Chamado primeiro
    public void init(){
        // Inicialização
    };
    
    //Segundo a ser chamado, logo após init(). Também chamado sempre que o Applet é reiniciado
    public void start(){
        //Inicia ou retorna a execução
    };
    
    //Chamado quando o applet é interrompido
    public void stop(){
        //Suspende a execução
    };
    
    //Chamado quando o Applet é encerrado. Este é o ultimo método executado
    public void destroy(){
        //Executa atividades de encerramento/desligamento
    };
    
    //Chamado quando a janela de um applet deve ser restaurada.
    public void paint(Graphics g){
        //Re-exibe o conteúdo da janela
    }
    
}
